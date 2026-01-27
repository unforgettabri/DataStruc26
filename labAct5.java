import java.util.Scanner;
public class labAct5{
    public static void main(String[] args) {
        
        //variable initialization
        String name, taste, texture, aroma;
        double price;  
        int entryCount = 0;

        String register = "";
        char regChar = 0;

        // Arrays to store up to 100 items
        String[] foodNames = new String[100];
        String[] foodTastes = new String[100];
        String[] foodTextures = new String[100];
        double[] foodPrices = new double[100];
        String[] foodAromas = new String[100];

        //item and its 5 variables  
        System.out.print("""
            ====================
                    FOOD
            ====================

            1. Name
            2. Taste
            3. Texture
            4. Price
            5. Aroma

            ====================

                """);
        
        //ask user if they want to register food items
        regChar = yOrN(register, regChar);

        //loop to count registered entries
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

            //increment entry count
            entryCount++;

            //ask user if they want to register food items
            regChar = yOrN(register, regChar);
            
        } while(regChar=='Y'||regChar=='y');

        if (regChar=='N'||regChar=='n'){
            System.out.println("Displaying values...");
        }

        //display registered entries
        for (int i = 0; i < entryCount; i++){
        System.out.println();                
        displayInfo(foodNames[i], foodTastes[i], foodTextures[i], foodPrices[i], foodAromas[i]);
        }

        System.out.println("Thank you for using the food registry program. Till next time patay gutom!");
    }

    // methods for input and display value

    public static char yOrN(String register, char regChar) {
        Scanner input = new Scanner(System.in);
        System.out.print("Register some food items? Y/N: ");
        register = input.nextLine();
        return regChar = register.charAt(0);  
    }
    public static String InputString() {
        Scanner sc = new Scanner(System.in);
        String strInput = sc.nextLine();
        return strInput;
    }

   public static double InputDouble() {
        Scanner scan = new Scanner(System.in);
        double dInput = scan.nextDouble();
        return dInput;
    }

    public static void displayInfo(String name, String taste, String texture, double price, String aroma){
        System.out.println("====================");
        System.out.println("Food Name: " + name);
        System.out.println("Taste: " + taste);
        System.out.println("Texture: " + texture);
        System.out.printf("Price: %.2f\n", price);
        System.out.print("Aroma: " + aroma);
    }
}