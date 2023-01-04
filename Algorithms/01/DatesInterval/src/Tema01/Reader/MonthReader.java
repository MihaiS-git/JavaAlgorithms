package Tema01.Reader;

import java.util.Scanner;

public class MonthReader {
    private int month;

    public int readMonth() {
        Scanner input = new Scanner(System.in);
        System.out.println("Month: ");
        int month = input.nextInt();
        return month;
    }
}
