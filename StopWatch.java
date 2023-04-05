package ss04_excercise_OOP;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }


    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    public void start(){
        this.startTime = new Date().getTime();
    }
    public void stop(){
       this.endTime = new Date().getTime();
    }
    public long getElapsedTime(){
       return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch watch = new StopWatch();
        watch.start();
        System.out.println("Do you want stop the clock?If you want,please enter 'ok'");
        String input = sc.nextLine();
        if(Objects.equals(input,"ok")){
            watch.stop();
        }
        System.out.println(watch.getElapsedTime());

    }
}
