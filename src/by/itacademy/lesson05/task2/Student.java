package by.itacademy.lesson05.task2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Datable {
    private String name;
    private String surname;
    private Date birth;

    public Student(String name, String surname, Date birth) {
        super();
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    @Override
    public Date getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth=" + formatter.format(birth) +
                '}';
    }
}
