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
                // method for grocery shoppermart
                break;
            case 2:
                // method for movie rental registration
                break;
            case 3:
                // method for colleges enrollment registration
                break;
            case 4:
                exitProgram();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option (1-4).");
                return;
        }
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
