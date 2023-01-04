package Tema01.Reader;

import java.util.Scanner;

public class YearReader {
    private int year;

    public int readYear() {
        Scanner input = new Scanner(System.in);
        System.out.println("Year: ");
        int year = input.nextInt();
        return year;
    }
}
