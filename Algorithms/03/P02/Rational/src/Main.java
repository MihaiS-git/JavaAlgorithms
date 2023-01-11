import java.util.*;
import java.util.ArrayList;

/*
Nr. 2
A. TAD RATIONAL. Se realizează cel puţin metodele produs (produsul a două numere de tip
     RATIONAL) şi  maiMareEgal (compararea a două numere de tip  RATIONAL).
B. Fiind date mai multe numere raţionale de la tastatură sub forma unor numere reale cu cel mult 5
     zecimale (se crează un tablou de numere raţionale), să se determine cel mai mic şi cel mai mare
     dintre ele şi produsul  lor.
     Numerele se introduc pe acelaşi rând şi separate prin virgulă.

*/


public class Main {
    public static int optionRead(String keyboardInput) {                        //method for reading the option for the menu as keyboard input
        System.out.print(keyboardInput);
        Scanner input = new Scanner(System.in);
        return input.nextInt();                                                 //the option for menu should be an Integer -> we use nextInt()
    }

    public static ArrayList<Rational> numbersRead() {                           //method for reading the numbers as keyboard input
        ArrayList<Double> numbersList = new ArrayList<>();                      //define an empty ArrayList of Doubles
        Scanner input = new Scanner(System.in);
        String inputValues = input.nextLine();                                  //the input should be read as a String -> we use nextLine()
        String[] valuesArray = inputValues.split(",");                    //split the read string by commas "," and put the elements in an Array as Strings
        for (String item : valuesArray) {                                       //with for each element of the Array of Strings, we cast the elements to Doubles and put them in the ArrayList
            numbersList.add(Double.parseDouble(item));
        }
        ArrayList<Rational> userFractionsList = toFractionsList(numbersList);   //define and initialize an ArrayList of Rational elements and populate it with the Doubles transformes in fractions with 'toFractionsList' method
        return userFractionsList;                                               //return the list of fractions
    }

    public static void printFractionsList(ArrayList<Rational> list) {           //method to print the fractions list
        System.out.println("\nFractions list: ");
        for (Rational item : list) {                                            //iterate through the list and print each element with the 'toString()' overriden method
            System.out.print(item.toString() + ", ");
        }
        System.out.println();
    }

    public static Rational toFraction(double number) {                          //method to transform a Double to Fraction, object of the class Rational
        String str = String.valueOf(number);                                    //passing a Double to String
        int dotIndex = str.indexOf('.');                                        //find the index for the decimal separator "."
        int strLen = str.length();                                              //length of the number format with decimals and decimals separator
        int numberOfDigits = strLen - dotIndex - 1;                             //calculate the number of decimals
        long numerator = (long) (number * Math.pow(10, numberOfDigits));        //define, initialize and multiply the numerator of the fraction with 10 raised at the power of the number of digits
        long denominator = (long) Math.pow(10, numberOfDigits);                 //define and initialize the denominator of the fraction with 10 raised at the power of the number of digits
        //formare numar rational
        Rational r = new Rational();                                            //create an instance of the class Rational referenced as r
        r.setA(numerator);                                                      //setting the numerator of the fraction
        r.setB(denominator);                                                    //setting the denominator
        r.simplify();                                                           //use of the simplify method for the fraction
        return r;                                                               //return the fraction
    }

    public static ArrayList<Rational> toFractionsList(ArrayList<Double> myList) {       //method to put and transform the Double elements of the ArrayList in another ArrayList of Rationals(fractions)
        ArrayList<Rational> fractionsList = new ArrayList<>();                          //define a new ArrayList with elements of type Rational
        for (double item : myList) {                                                    //iterate through the Doubles ArrayList
            Rational fraction = toFraction(item);                                       //transform the Doubles to fractions with the 'toFraction' method
            fractionsList.add(fraction);                                                //add the new element type Rational(fraction) to the ArrayList of Rational
        }
        return fractionsList;                                                           //return the ArrayList of Rational
    }

    public static Rational minFraction(ArrayList<Rational> myList){             //method to find and return the min value element of an ArrayList of Rational elements
        Rational min = myList.get(0);                                           //assume that the first element of the list is the min
        for (int i=1; i<=myList.size()-1;i++){                                  //iterate through the element of the list and compare each element with the assumed min
            if (Rational.compareFractions(min, myList.get(i))==1){              //using the 'compareFractions' method of the class Rational
                min = myList.get(i);                                            //if the element is smaller than the min, the min will take the element's value
            }
        }
        return min;                                                             //return the min
    }

    public static Rational maxFraction(ArrayList<Rational> myList){            //same as min, return the max
        Rational max = myList.get(0);
        for (int i=1; i<=myList.size()-1;i++){
            if (Rational.compareFractions(max, myList.get(i))==2){
                max = myList.get(i);
            }
        }
        return max;
    }

    public static int menu() {                                                  //method to create the options menu
        System.out.println();
        System.out.println("1. Read the list of rational numbers");
        System.out.println("2. Find MIN");
        System.out.println("3. Find MAX");
        System.out.println("4. Calculate the product of MIN and MAX");
        System.out.println("5. Calculate the division of MIN and MAX");
        System.out.println("6. Calculate the sum of MIN and MAX");
        System.out.println("7. Calculate the difference of MIN and MAX");
        System.out.println("0. Exit");
        return optionRead("Chose an option(0-7): ");                     //ask the user to enter an option
    }


    public static void main(String[] args) {                                        //the Main body
        ArrayList<Rational> myList = new ArrayList<>();                             //declare an ArrayList with Rational type of elements
        int option = menu();
        while (option != 0) {                                                       //create a cycle of asking and reading the options for the menu from the user's inputs
            switch (option) {                                                       //switch-case for the menu options
                case 1: {                                                           //case 1 - read the String of numbers keyboard input and print the list of elements as fractions
                    System.out.println("\nEnter a list of at least 2 rational numbers separated by commas(max 5 digits): ");
                    myList = numbersRead();                                         //call of the read method
                    printFractionsList(myList);                                     //call of the print method
                    break;
                }
                case 2: {                                                           //case 2 - with the 'minFraction' method call, find and print the min value of the fractions list
                    System.out.println("\nThe MIN is "+minFraction(myList));
                    break;
                }
                case 3: {                                                           //case 3 - with the 'maxFraction' method call, find and print the max value of the fractions list
                    System.out.println("\nThe MAX is "+maxFraction(myList));
                    break;
                }
                case 4: {                                                           //case 4 - calling the 'multiply' method of the Rational class, to calculate and then print the product of the min fraction and the max fraction
                    System.out.print("\nThe product of MIN and MAX: ");
                    Rational myProduct = Rational.multiply(minFraction(myList),maxFraction(myList));
                    System.out.println(myProduct);
                    System.out.println();
                    break;
                }
                case 5: {                                                           //case 5 - calling the 'divide' method of the Rational class, to calculate and then print the division of the max fraction by the min fraction
                    System.out.print("\nThe division of MIN and MAX: ");
                    Rational myDivision = Rational.divide(maxFraction(myList),minFraction(myList));
                    System.out.println(myDivision);
                    System.out.println();
                    break;
                }
                case 6: {                                                           //case 6 - calling the 'sum' method of the Rational class, to calculate and then print the sum of the min fraction and the max fraction
                    System.out.println("\nThe sum of MIN and MAX: ");
                    Rational mySum = Rational.sum(minFraction(myList),maxFraction(myList));
                    System.out.println(mySum);
                    System.out.println();
                    break;
                }
                case 7: {                                                           //case 7 - calling the 'diff' method of the Rational class, to calculate and then print the difference between the min fraction and the max fraction
                    System.out.println("\nThe difference of MIN and MAX: ");
                    Rational myDiff = Rational.diff(minFraction(myList),maxFraction(myList));
                    System.out.println(myDiff);
                    System.out.println();
                    break;
                }
                default: {                                                          //asking the user for a valid key input if for the menu option he hasn't entered a valid value (0-7)
                    System.out.println("\nPlease enter a valid key!!!");
                    break;
                }
            }
            option = menu();                                                        //calling the menu() method and reading the option in the 'option' variable
        }
        System.out.println("End");
    }
}

