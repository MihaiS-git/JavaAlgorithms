import java.util.Scanner;

//25.  Se dă un vector de numere întregi de lungime n.
// Să se sorteze numerele de indice par crescător
// iar celelalte de indice impar să se sorteze descrescător.

public class Main {

    public static int readFunction(String keyboardInput){
        System.out.print(keyboardInput);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int menu(){
        System.out.println();
        System.out.println("1. Read the array");
        System.out.println("2. Sort the array and print the sorted arrays");
        System.out.println("3. Print the original array");
        System.out.println("0. Exit");
        return readFunction("Choose an option:");
    }

    public static void sortArray(int [] myArray){
        int [] evenArray = new int [myArray.length/2+1];
        int [] oddArray = new int[myArray.length/2];
        for(int i = 0 ; i <= myArray.length-1; i++){
            if (i%2!=0){
                oddArray[(i-1)/2] = myArray[i];
            } else {
                evenArray[i/2] = myArray[i];
            }
        }
        sortDescendingArray(oddArray);
        sortAscendingArray(evenArray);
    }

    public static void sortAscendingArray(int [] myArray){
        for(int i=0; i<myArray.length; i++){
            for (int j=0; j<myArray.length-i-1; j++){
                if(myArray[j]<myArray[j+1]){
                    int temp = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j]=temp;
                }
            }
        }
        printArray(myArray);
    }

    public static void sortDescendingArray(int [] myArray){
        for(int i=0; i<myArray.length; i++){
            for (int j=0; j<myArray.length-i-1; j++){
                if(myArray[j]>myArray[j+1]){
                    int temp = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j]=temp;
                }
            }
        }
        printArray(myArray);
    }

    public static void printArray(int [] myArray){
        System.out.println();
        System.out.println("Array:");
        for(int i=0; i<=myArray.length-1; i++){
            System.out.print(myArray[i]+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = readFunction("Enter the length of the array:");
        int [] myArray = new int[n];
        int option = menu();
        while(option != 0){
            switch(option){
                case 1: {
                    for (int i=0; i<=n-1; i++){
                        myArray[i] = readFunction("x["+i+"]=");
                    }
                    break;
                }
                case 2: {
                    sortArray(myArray);
                    break;
                }
                case 3: {
                    printArray(myArray);
                    break;
                }
                default: {
                    System.out.println("\nPlease enter a valid key!!!");
                    break;
                }
            }
            option = menu();
        }
        System.out.println("End");
    }
}
