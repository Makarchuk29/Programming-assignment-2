package ua.kpi.comsys.iv7216;

import java.sql.Time;

public class TimeVM {
    // task 4
    private int hours;
    private int minutes;
    private int seconds;

    // task 5 а
    public TimeVM() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
    // task 5 b
    public TimeVM(int hours, int minutes, int seconds) throws Exception {
        if(hours < 0 || hours > 23) throw new Exception("Incorrect hours");
        if(minutes < 0 || minutes > 59) throw new Exception("Incorrect minutes");
        if(seconds < 0 || seconds > 59) throw new Exception("Incorrect seconds");
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    // task 5 c
    public TimeVM(Time time){
        this.hours = time.getHours();
        this.minutes = time.getMinutes();
        this.seconds = time.getSeconds();
    }

    //task 6 a
    @Override
    public String toString() {
        return (((hours > 12 ) ? hours - 12 : hours) + ":" + minutes + ":" + seconds + " " + ((hours > 12 ) ? "PM" : "AM"));
    }

    //task 6 b
    public TimeVM sum(TimeVM timeVM) throws Exception {
        Time date1 = new Time(this.hours, this.minutes, this.seconds);
        Time date2 = new Time(timeVM.getHours(), timeVM.getMinutes(), timeVM.getSeconds());
        long sum = (date1.getTime() + date2.getTime() + 10800000);
        Time sumDate = new Time(sum);
        return new TimeVM(sumDate.getHours(), sumDate.getMinutes(), sumDate.getSeconds());
    }

    // task 6 c
    public TimeVM diff (TimeVM timeVM) throws Exception {
        Time date1 = new Time(this.hours, this.minutes, this.seconds);
        Time date2 = new Time(timeVM.getHours(), timeVM.getMinutes(), timeVM.getSeconds());
        long sum = (date1.getTime() - date2.getTime() - 10800000);
        Time sumDate = new Time(sum);
        return new TimeVM(sumDate.getHours(), sumDate.getMinutes(), sumDate.getSeconds());
    }

    //task 7 a
    public static TimeVM sum (TimeVM time1, TimeVM time2) throws Exception {
        Time date1 = new Time(time1.hours, time1.minutes, time1.seconds);
        Time date2 = new Time(time2.hours, time2.minutes, time2.seconds);
        long sum = (date1.getTime() + date2.getTime() + 10800000);
        Time sumDate = new Time(sum);
        return new TimeVM(sumDate.getHours(), sumDate.getMinutes(), sumDate.getSeconds());
    }

    //task 7 b
    public static TimeVM diff (TimeVM time1, TimeVM time2) throws Exception {
        Time date1 = new Time(time1.hours, time1.minutes, time1.seconds);
        Time date2 = new Time(time2.hours, time2.minutes, time2.seconds);
        long sum = (date1.getTime() - date2.getTime() - 10800000);
        Time sumDate = new Time(sum);
        return new TimeVM(sumDate.getHours(), sumDate.getMinutes(), sumDate.getSeconds());
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
