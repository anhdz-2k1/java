/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol01;

/**
 *
 * @author Anh
 */
public class Date {
    private int day , day = [1, 31]  ;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getday(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
         this.day = day;
    }
     public void setMonth(int month){
         this.month = month;
    }
    public void setyear(int year){
        this.year = year;
    }
    public  void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +  day + "//" + month + "//" + year + '}';
    }
    
    
}
