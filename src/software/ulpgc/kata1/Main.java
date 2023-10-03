package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main   {
    public static void main(String[] args) {
        Person santi = new Person("Santi", LocalDate.of(2003, 8, 20));
        System.out.println(santi);
    }
}
