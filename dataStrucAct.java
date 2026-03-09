import java.util.Scanner;
import java.io.*;

import java.util.InputMismatchException; 

public class dataStrucAct {
    // Arrays to store up to 100 items
    static String[] foodNames = new String[100];
    static String[] foodTastes = new String[100];
    static String[] foodTextures = new String[100];
    static double[] foodPrices = new double[100];
    static String[] foodAromas = new String[100];
    static int entryCount = 0;

    public static void main(String[] args) throws Exception {
        
        // file handlers
        File inputFile = new File("foods_output.txt");

        // Read from file and extract to arrays
        if (inputFile.exists()) {
            Scanner fileScanner = new Scanner(inputFile);
            while (fileScanner.hasNextLine() && entryCount < 100) {
                foodNames[entryCount] = fileScanner.nextLine();
                foodTastes[entryCount] = fileScanner.nextLine();
                foodTextures[entryCount] = fileScanner.nextLine();
                foodPrices[entryCount] = Double.parseDouble(fileScanner.nextLine());
                foodAromas[entryCount] = fileScanner.nextLine();
                entryCount++;
            }
            fileScanner.close();
            System.out.println("Loaded " + entryCount + " number of entries from the file.");
        }

        // Display all starting entries
        System.out.println("");
        System.out.println("Displaying current values...");
        for (int i = 0; i < entryCount; i++) {
            displayInfo(i);
        }


        //now menu

        System.out.println();
        System.out.println("====================");
        System.out.println("        MENU         ");
        System.out.println("====================");
        System.out.println("");
        System.out.println("1. Add");
        System.out.println("2. Search");
        System.out.println("3. Edit");
        System.out.println("4. Delete");
        System.out.println("5. Sort");
        System.out.println("6. List");
        System.out.println("");
        System.out.println("====================");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;

        while (true) {
            try {
                System.out.print("Please select an option (1-6): ");
                menuChoice = sc.nextInt();
                break; // valid input
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine(); // clear invalid input
            }
        }

        switch (menuChoice){
            case 1:
                System.out.println("Add selected");
                break;
            case 2:
                System.out.println("Search selected");
                break;
            case 3:
                System.out.println("Edit selected");
                break;
            case 4:
                System.out.println("Delete selected");
                break;
            case 5:
                System.out.println("Sort selected");
                break;
            case 6:
                displayInfo();
                break;
        }
    }

    public static void displayInfo(int index) {
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Food Name: " + foodNames[index]);
        System.out.println("Taste: " + foodTastes[index]);
        System.out.println("Texture: " + foodTextures[index]);
        System.out.printf("Price: %.2f\n", foodPrices[index]);
        System.out.print("Aroma: " + foodAromas[index]);
    }
}