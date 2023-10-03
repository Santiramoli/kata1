package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getYears(){
        return toYears((int) (LocalDate.now().toEpochDay()-birthday.toEpochDay()));
    }

    private int toYears(int i) {
        return (int) (i/365.25);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday + ", age=" + getYears()+
                '}';
    }
}
