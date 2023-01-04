package Tema01;

public class Calculations {


    public Calculations(Date date1, Date date2) {

        int deltaIndex1;
        int deltaIndex2 = 0;

        int y1 = date1.getYear();
        int y2 = date2.getYear();

        DayIndex dayIndex1 = new DayIndex(date1);
        DayIndex dayIndex2 = new DayIndex(date2);
        int index1 = dayIndex1.dayIndexCalc();
        int index2 = dayIndex2.dayIndexCalc();

        if (y2 == y1) {
            int deltaDays = index2 - index1;
            System.out.println("Total difference: " + deltaDays);
        } else {
            boolean leapYear = dayIndex1.isLeapYear();
            if (leapYear) {
                deltaIndex1 = 366 - index1;
            } else {
                deltaIndex1 = 365 - index1;
            }
            while (y2 > y1 + 1) {
                y2 -= 1;
                if ((y2 % 400 == 0) || (y2 % 4 == 0) && (y2 % 100 != 0)) {
                    deltaIndex2 = deltaIndex2 + 366;
                } else {
                    deltaIndex2 = deltaIndex2 + 365;
                }
            }
            int deltaDays = deltaIndex1 + deltaIndex2 + index2;
            System.out.println("Total difference: " + deltaDays);
        }
    }
}
