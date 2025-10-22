package 컴페어러블실습;


import java.util.Scanner;
import java.util.TreeSet;

public class Input {
    private final static Scanner sc = new Scanner(System.in);
    private final static TreeSet<Student> studentTreeSet = new TreeSet<>();

    static void getDate() {
        studentTreeSet.add(new Student("A", 1001, 80, 65, 15, 95));
        studentTreeSet.add(new Student("B", 1002, 15, 25, 85, 15));
        studentTreeSet.add(new Student("C", 1003, 83, 75, 65, 27));
        studentTreeSet.add(new Student("D", 1004, 83, 75, 65, 27));
        studentTreeSet.add(new Student("E", 1005, 15, 25, 85, 15));
        studentTreeSet.add(new Student("F", 1006, 80, 65, 15, 95));
        studentTreeSet.add(new Student("G", 1007, 15, 23, 36, 43));
        studentTreeSet.add(new Student("H", 1008, 35, 22, 37, 42));
        studentTreeSet.add(new Student("I", 1009, 100, 21, 38, 41));
        studentTreeSet.add(new Student("J", 1010, 75, 100, 95, 100));

        for (Student student : studentTreeSet) System.out.println(student);
    }
}


