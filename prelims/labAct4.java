import java.util.Scanner;

public class labAct4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

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
}
