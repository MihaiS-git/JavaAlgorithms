package Tema01;

//3.  Se da o dată calendaristica citita de la tastatura sub forma
//        (zi,luna,an). Program care determina numarul de ordine al zilei în
//        an.

public class DayIndex {
    int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int[] normalYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int index = 0;
    Date date;

    public DayIndex(Date date) {
        this.date = date;
    }

    public boolean isLeapYear() {
        int year = date.getYear();
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    private Integer daysSumLeap() {
        int month = date.getMonth()-1;
        for (int i=month;i>0;i--){
            this.index = this.index + this.leapYear[i-1];
        }
        return this.index;
    }

    private Integer daysSumNormal() {
        int month = date.getMonth()-1;
        for (int i=month;i>0;i--){
            this.index = this.index + this.normalYear[i-1];
        }
        return this.index;
    }

    public Integer dayIndexCalc() {
        int day = date.getDay();
        if (isLeapYear()) {
            this.index = this.index + day + daysSumLeap();
        } else {
            this.index = this.index + day + daysSumNormal();
        }
        return this.index;
    }
}
