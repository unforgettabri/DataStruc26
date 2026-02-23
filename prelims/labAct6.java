import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

public class labAct6 {
    public static void main(String[] args) {

        int rent = 0, sales = 0, comedy = 0, horror = 0, scifi = 0, drama = 0, cartoons = 0, dvdTotal = 0, vcdTotal = 0,
                tapeTotal = 0;

        char anotherChar;
        try (FileWriter writer = new FileWriter("transactions.txt")) {
            do {
                System.out.println("""
                            Registration:
                            1. DVD
                            2. VCD
                            3. Tape
                        """);

                // input code(choice)
                Scanner input = new Scanner(System.in);
                System.out.print("Choice: ");
                int choice = input.nextInt();

                switch (choice) {
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
                        System.out.println("Invalid choice");
                }

                // input title
                System.out.print("Title: ");
                String title = input.next();

                // input genre
                System.out.println();
                System.out.println("""
                                Genre:
                                1. Horror
                                2. Scifi
                                3. Drama
                                4. Comedy
                                5. Cartoons
                        """);

                // input category(genre)
                Scanner sc = new Scanner(System.in);
                System.out.print("Category: ");
                int category = sc.nextInt();

                // switch case for genre
                switch (category) {
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
                }

                // input minutes
                Scanner scan = new Scanner(System.in);
                System.out.print("Minutes: ");
                int minutes = scan.nextInt();

                // input setting(genre)
                Scanner basta = new Scanner(System.in);
                System.out.print("Genre ---> Settings: ");
                String settings = basta.next();

                // display kind of transaction
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
                }

                // ask the user for price
                Scanner eme = new Scanner(System.in);
                System.out.print("Price: ");
                int price = eme.nextInt();

                // ask the user if they want to register another
                Scanner shala = new Scanner(System.in);
                System.out.print("Register another Y/N? ");
                String another = shala.next();
                anotherChar = another.charAt(0);
            } while (anotherChar == 'Y' || anotherChar == 'y');
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        try (FileWriter writer = new FileWriter("transactions.txt")) {
            writer.write("----------Results----------\n");
            writer.write("Total Rent: " + rent + "\n");
            writer.write("Total Sales: " + sales + "\n");
            writer.write("Total VCD: " + vcdTotal + "\n");
            writer.write("Total DVD: " + dvdTotal + "\n");
            writer.write("Total Tape: " + tapeTotal + "\n");
            writer.write("Total Horror: " + horror + "\n");
            writer.write("Total Scifi: " + scifi + "\n");
            writer.write("Total Drama: " + drama + "\n");
            writer.write("Total Comedy: " + comedy + "\n");
            writer.write("Total Cartoons: " + cartoons + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}