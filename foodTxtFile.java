import java.util.Scanner;
import java.io.*;

public class foodTxtFile {
    // Arrays to store up to 100 items
    static String[] foodNames = new String[100];
    static String[] foodTastes = new String[100];
    static String[] foodTextures = new String[100];
    static double[] foodPrices = new double[100];
    static String[] foodAromas = new String[100];
    static int entryCount = 0;

    public static void main(String[] args) throws Exception {
        
        // File handling
        File inputFile = new File("foods.txt");
        FileWriter fw = new FileWriter("foods_output.txt");
        
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
            System.out.println("Loaded " + entryCount + " entries from file.");
        }

        // Display menu
        System.out.println("====================");
        System.out.println("       FOOD         ");
        System.out.println("====================");
        System.out.println("");
        System.out.println("1. Name");
        System.out.println("2. Taste");
        System.out.println("3. Texture");
        System.out.println("4. Price");
        System.out.println("5. Aroma");
        System.out.println("");
        System.out.println("====================");

        // Add entries
        char regChar;
        do {
            System.out.print("Food Name: ");
            foodNames[entryCount] = InputString();

            System.out.print("Taste: ");
            foodTastes[entryCount] = InputString();

            System.out.print("Texture: ");
            foodTextures[entryCount] = InputString();

            System.out.print("Price: ");
            foodPrices[entryCount] = InputDouble();

            System.out.print("Aroma: ");
            foodAromas[entryCount] = InputString();

            entryCount++;

            System.out.print("Register some food items? Y/N: ");
            regChar = yOrN();
            
        } while (regChar == 'Y' || regChar == 'y');

        // Display all entries
        System.out.println("\nDisplaying values...");
        for (int i = 0; i < entryCount; i++) {
            displayInfo(i);
        }

        // Write all data to file
        for (int i = 0; i < entryCount; i++) {
            fw.write(foodNames[i] + "\n");
            fw.write(foodTastes[i] + "\n");
            fw.write(foodTextures[i] + "\n");
            fw.write(foodPrices[i] + "\n");
            fw.write(foodAromas[i] + "\n");
        }
        
        fw.close();
        
        System.out.println("\nThank you for using the food registry program. Till next time patay gutom!");
    }

    // ==================== HELPER METHODS ====================
    
    public static void displayInfo(int index) {
        System.out.println("====================");
        System.out.println("Food Name: " + foodNames[index]);
        System.out.println("Taste: " + foodTastes[index]);
        System.out.println("Texture: " + foodTextures[index]);
        System.out.printf("Price: %.2f\n", foodPrices[index]);
        System.out.print("Aroma: " + foodAromas[index]);
    }

    public static char yOrN() {
        Scanner input = new Scanner(System.in);
        String register = input.nextLine();
        return register.charAt(0);
    }

    public static String InputString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static double InputDouble() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}