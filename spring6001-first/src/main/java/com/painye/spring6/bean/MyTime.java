package com.painye.spring6.bean;
/**
 * @author pan
 * @date 2024/4/22 7:53
 */

/**
 * @ClassName : com.painye.spring6.bean.MyTime
 * @Description : 类描述
 * @author pan
 * @date 2024/4/22 7:53
 */
public class MyTime {

    private int year;
    private int month;
    private int day;

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public void setDay(int day) {
        this.day = day;
    }
}
