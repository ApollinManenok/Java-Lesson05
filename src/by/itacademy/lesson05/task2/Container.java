package by.itacademy.lesson05.task2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Container implements InputInfo, AverageAge {
    Datable[] container;
    int index = 0;

    public Container(int size) {
        this.container = new Datable[size];
    }

    @Override
    public void add() throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scan.nextLine();
        System.out.print("Enter student surname: ");
        String surname = scan.nextLine();
        System.out.print("Enter student birth date in 'yyyy/MM/dd HH:mm' format: ");
        String strDate = scan.nextLine();
        DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date birth = formatter.parse(strDate);
        container[index] = new Student(name, surname, birth);
        index++;
    }

    @Override
    public void average() {
        long average = 0;
        long now = new Date().getTime();
        for (int i = 0; i < index; i++) {
            long diff = Math.abs(now - container[i].getBirth().getTime());
            average += diff;
        }
        if (index != 0)
            average /= index;
        int minutes = (int)(average/1000/60)%60;
        int hours = (int)(average/1000/60/60)%24;
        int days = (int)(average/(1000*60*60*24));
        int months = (int)Math.floor((days/30.43)%12);//(365*3+366)/(12*4) = 30.4375 but 30.43 closer to real with days
        int years = (int)Math.floor(days/(30.43*12));
        days= (int)(days%30.43);
        System.out.println(years+" years "+months+" months "+days+" days "+hours+" hours "+minutes+" minutes");
    }
}
