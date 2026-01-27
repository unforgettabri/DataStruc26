import java.util.Scanner;
public class labAct2{
    public static void main(String[] args) {
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
            } while((cAnotherP == 'Y') || (cAnotherP == 'y'));

            System.out.println("Bill: " + dBill);
            System.out.print("Payment: ");
            dPay = input.nextDouble();

            input.nextLine();

            if (dPay >= dBill){
            dChange = dPay - dBill;
            System.out.println("Change: " +dChange);
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
}