import java.util.Scanner;
public class labAct3{
    public static void main(String[] args) {

        int rent = 0, sales = 0, comedy = 0, horror = 0, scifi = 0, drama = 0, cartoons = 0, dvdTotal = 0, vcdTotal = 0, tapeTotal = 0 ;

        char anotherChar;
        do{
            System.out.println("""
                Registration:
                1. DVD
                2. VCD
                3. Tape
            """);

            //input code(choice)
            Scanner input = new Scanner(System.in);
            System.out.print("Choice: ");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                    dvdTotal++;
                    break;
                case 2:
                    vcdTotal++;
                    break;
                case 3:
                    tapeTotal++;
                    break;
                default:
                    System.out.print("Invalid choice. Enter 1–3 only: ");
                    choice = input.nextInt();
            }

            //input title
            System.out.print("Title: ");
            input.nextLine(); // flush
            String title = input.nextLine();
            while (title.trim().isEmpty()) {
                System.out.print("Title cannot be empty. Enter again: ");
                title = input.nextLine();
            }

            //input genre
            System.out.println();
            System.out.println("""
                    Genre:
                    1. Horror
                    2. Scifi
                    3. Drama
                    4. Comedy
                    5. Cartoons
            """);

            //input category(genre)
            Scanner sc = new Scanner(System.in);
            System.out.print("Category: ");
            int category = sc.nextInt();

            //switch case for genre
            switch (category){
                case 1: 
                    horror++;
                    break;  
                case 2:
                    scifi++;
                    break;
                case 3:
                    drama++;
                    break;
                case 4:
                    comedy++;
                    break;
                case 5:
                    cartoons++;
                    break;
                default:
                    System.out.print("Invalid genre. Enter 1–5 only: ");
                    category = input.nextInt();
            }   

            //input minutes
            Scanner scan = new Scanner(System.in);
            System.out.print("Minutes: ");
            int minutes = scan.nextInt();
            while (minutes <= 0) {
                System.out.print("Minutes must be greater than 0: ");
                minutes = input.nextInt();
            }

            //input setting(genre)
            Scanner basta = new Scanner(System.in);
            System.out.print("Genre: ");
            String settings = basta.next();

            //display kind of transaction
            System.out.println();
            System.out.println("""
                    Transaction:
                    1. Rent
                    2. Sale
            """);
            Scanner blabla = new Scanner(System.in);
            System.out.print("Transaction: ");
            int transaction = blabla.nextInt();
            if (transaction == 1) {
                rent++;
            } else if (transaction == 2) {
                sales++;
            } else {
                System.out.println("Invalid transaction");
            }

            //ask the user for price
            Scanner eme = new Scanner(System.in);
            System.out.print("Price: ");
            int price = eme.nextInt();
            input.nextLine();

            //ask the user if they want to register another
            Scanner shala = new Scanner(System.in);
            System.out.print("Register another Y/N? ");
            String another = shala.next();
            anotherChar = another.charAt(0);
        } while (anotherChar == 'Y' || anotherChar == 'y');

        //display the reports
        System.out.println();
        System.out.println("----- Reports -----");
        System.out.println("Total Rent: " + rent);
        System.out.println("Total Sales: " + sales);
        System.out.println("Total VCD: " + vcdTotal);
        System.out.println("Total DVD: " + dvdTotal);
        System.out.println("Total Tape: " + tapeTotal);
        System.out.println("Total Horror: " + horror);
        System.out.println("Total Scifi: " + scifi);
        System.out.println("Total Drama: " + drama);
        System.out.println("Total Comedy: " + comedy);
        System.out.println("Total Cartoons: " + cartoons);
    }
}
