package Tema01;

import Tema01.Reader.DayReader;
import Tema01.Reader.MonthReader;
import Tema01.Reader.YearReader;

//4.  Se dau 2 date calendaristice, citite de la tastatura (vezi
//        p.3) Program care determină numărul de zile trăite de persoana
//        respective între cele 2 date calendaristice.
//        (1,12,2020) şi (5,12,2021) => 366+5 = 371 zile

public class DateMain {
    public static void main(String[] args) {
        int day1, day2, month1, month2, year1, year2;

        System.out.println("Enter 2 dates(chronological order):");
        System.out.println("First date:");
        day1 = new DayReader().readDay();
        month1 = new MonthReader().readMonth();
        year1 = new YearReader().readYear();

        System.out.println("Second date:");
        day2 = new DayReader().readDay();
        month2 = new MonthReader().readMonth();
        year2 = new YearReader().readYear();

        Date date1 = new Date(day1, month1, year1);
        Date date2 = new Date(day2, month2, year2);

        new Calculations(date1, date2);
    }
}
