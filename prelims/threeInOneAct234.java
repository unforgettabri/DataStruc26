import java.util.Scanner;

public class threeInOneAct234 {

    // universal things
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // main menu
        System.out.println("""
                ====================
                     MAIN MENU
                ====================

                1. EFM Grocery ShopperMart POS
                2. EFM Movie Rental Registration
                3. EFM Colleges Enrollment Registration
                4. Exit

                ====================
                    """);

        System.out.print("Please select an option (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                grocery();
                break;
            case 2:
                movie();
                break;
            case 3:
                college();
            case 4:
                exitProgram();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option (1-4).");
                return;
        }
    }

    public static void college() {

        // declare variablez
        int iprodId = 0;
        String strprodName, strProdDesc;
        double dQty, dPrice, dDiscount;

        // ask for user inputs
        System.out.println("Please input the following: ");

        System.out.print("Product ID: ");
        iprodId = InputInt();

        System.out.print("Name: ");
        strprodName = InputString();

        System.out.print("Description: ");
        strProdDesc = InputString();

        System.out.print("Quantity: ");
        dQty = InputDouble();

        System.out.print("Price: ");
        dPrice = InputDouble();

        System.out.print("Discount: ");
        dDiscount = InputDouble();

        // call nethod that compute the salary
        double subTOtal = computeTotal(dPrice, dQty, dDiscount);

        // for spacing
        System.out.println();

        // method that will display product details and computed total
        displayInfo(iprodId, strprodName, dPrice, dQty, dDiscount, subTOtal);

    }

    public static String InputString() {
        String strInput = sc.nextLine();
        return strInput;
    }

    public static int InputInt() {
        int iInput = sc.nextInt();
        sc.nextLine();
        return iInput;
    }

    public static double InputDouble() {
        double dInput = sc.nextDouble();
        return dInput;
    }

    public static double computeTotal(double dPrice, double dQty, double dDiscount) {

        double dSubTotal = (dPrice * dQty) - dDiscount;
        return dSubTotal;
    }

    public static void displayInfo(int iprodId, String strprodName, double dPrice, double dQty, double dDiscount,
            double subTOtal) {
        System.out.println(iprodId + " " + strprodName);
        System.out.println("Priced at " + dPrice + " for " + dQty + " pieces.");
        System.out.println("Discounted at " + dDiscount);
        System.out.println("Subtotal: " + subTOtal);
    }

    public static void movie() {

        int rent = 0, sales = 0, comedy = 0, horror = 0, scifi = 0, drama = 0, cartoons = 0, dvdTotal = 0, vcdTotal = 0,
                tapeTotal = 0;

        char anotherChar;
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
                    System.out.print("Invalid choice. Enter 1–3 only: ");
                    choice = input.nextInt();
            }

            // input title
            System.out.print("Title: ");
            input.nextLine(); // flush
            String title = input.nextLine();
            while (title.trim().isEmpty()) {
                System.out.print("Title cannot be empty. Enter again: ");
                title = input.nextLine();
            }

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
                default:
                    System.out.print("Invalid genre. Enter 1–5 only: ");
                    category = input.nextInt();
            }

            // input minutes
            Scanner scan = new Scanner(System.in);
            System.out.print("Minutes: ");
            int minutes = scan.nextInt();
            while (minutes <= 0) {
                System.out.print("Minutes must be greater than 0: ");
                minutes = input.nextInt();
            }

            // input setting(genre)
            Scanner basta = new Scanner(System.in);
            System.out.print("Genre: ");
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
            } else {
                System.out.println("Invalid transaction");
            }

            // ask the user for price
            Scanner eme = new Scanner(System.in);
            System.out.print("Price: ");
            int price = eme.nextInt();
            input.nextLine();

            // ask the user if they want to register another
            Scanner shala = new Scanner(System.in);
            System.out.print("Register another Y/N? ");
            String another = shala.next();
            anotherChar = another.charAt(0);
        } while (anotherChar == 'Y' || anotherChar == 'y');

        // display the reports
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

    public static void grocery() {
        Scanner input = new Scanner(System.in);

        String strProdName, strAnotherP;
        String strCustomer;

        char cCustomer = 'n', cAnotherP = 'n';

        double dQty, dBill, dPrice;
        double dTotal, dPay, dChange = 0;

        do {
            dBill = 0;
            do {
                System.out.println("\nWelcome to EFM Grocery");

                System.out.print("Input product name: ");
                strProdName = input.nextLine();

                System.out.print("Price: ");
                dPrice = input.nextDouble();

                System.out.print("Quantity: ");
                dQty = input.nextDouble();

                input.nextLine();

                dTotal = dQty * dPrice;
                System.out.print("Total: " + dTotal);
                dBill = dBill + dTotal;

                System.out.print("Another product Y/N? ");
                strAnotherP = input.nextLine();

                cAnotherP = strAnotherP.charAt(0);
            } while ((cAnotherP == 'Y') || (cAnotherP == 'y'));

            System.out.printf("Total: %.2f%n", dTotal);
            System.out.printf("Bill: %.2f%n", dBill);
            dPay = input.nextDouble();

            input.nextLine();

            if (dPay >= dBill) {
                dChange = dPay - dBill;
                System.out.printf("Change: %.2f%n", dChange);
                System.out.println("Thank you for shopping.");
            } else {
                System.out.println("Money is not enough!");
            }

            System.out.println("Another customer Y/N?");
            strCustomer = input.nextLine();

            cCustomer = strCustomer.charAt(0);

        } while ((cCustomer == 'Y') || (cCustomer == 'y'));
        System.out.println("Grocery program terminating...");
    }

    public static void exitProgram() {
        System.out.println(); // space
        String message = "Terminating Program... Salamat sa lahat!";
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            try {
                Thread.sleep(100); // pauses 0.1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // basta ganon jusq
            }
        }
        System.exit(0);
    }
}