import java.util.Scanner;

//24. Se dă un vector de numere întregi de lungime n. Se mai dă un număr
//        k : 1 <k< n.
//        Să se sorteze descrescător primele k componente ale vectorului,
//        iar celelelte să se sorteze crescător.


public class Main {

    public static int readOption(String keyboardInput){
        System.out.print(keyboardInput);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int menu(){
        System.out.println();
        System.out.println("1. Read the array");
        System.out.println("2. Sort the array");
        System.out.println("3. Print the array");
        System.out.println("0. Exit");
        return readOption("Choose an option: ");
    }
    
    public static void sortVector (int [] myArray, int k, int n){
        //sort first k elements
        for(int i=0; i<=k-1; i++){
            for(int j=0; j<=k-i-1; j++){
                if (myArray[j]<myArray[j+1]){
                    int temp = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        //sort the other elements
        for (int i=k+1; i<n-1; i++){
            for (int j=k+1; j<=n-2; j++){
                if(myArray[j]>myArray[j+1]){
                    int temp = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    }

    public static void printArray(int [] myArray, int n){
        System.out.println("\nArray:");
        for (int i=0; i<=n-1; i++){
            System.out.print(myArray[i]+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = readOption("Enter the length of the array:");
        int k = readOption("Enter k:");
        int [] myArray = new int[n];
        int option = menu();
        while (option != 0){
            switch (option){
                case 1: {
                    for (int i = 0; i <= n - 1; i++) {
                        myArray[i] = readOption("x[" + i + "]=");
                    }
                    break;
                }
                case 2: {
                    sortVector(myArray, k, n);
                    break;
                }
                case 3: {
                    printArray(myArray, n);
                    break;
                }
                default: {
                    System.out.println();
                    System.out.println("Please enter a valid key!!!");
                    option = menu();
                }
            }
            option = menu();
        }
        System.out.println("End");
    }
}
