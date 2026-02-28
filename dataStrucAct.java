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