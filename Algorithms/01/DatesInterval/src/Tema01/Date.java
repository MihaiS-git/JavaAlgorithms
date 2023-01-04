package Tema01;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void PrintDate() {
        System.out.println("Date: " + this.day + '.' + this.month + '.' + this.year);
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

}
