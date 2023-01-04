package Tema01.Reader;
import java.util.Scanner;

public class DayReader {
    private int day;

    public int readDay() {
        Scanner input = new Scanner(System.in);
        System.out.println("Day: ");
        int day = input.nextInt();
        return day;
    }
}





