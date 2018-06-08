package by.itacademy.lesson05.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Task2 {
    public static void main(String[] args){
        Container container = new Container(5);
        InputInfo info = container;
        for (int i = 0; i < 5; i++) {
            try {
                info.add();
            } catch (ParseException e) {
                System.out.println("Wrong date: "+e.getMessage());
                i--;
            }
        }
        AverageAge average = container;
        average.average();

    }
}
