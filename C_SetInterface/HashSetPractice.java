package C_SetInterface;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1, "lakshaya");
        Student s2 = new Student(1, "lakshaya");
        Student s3 = new Student(1, "lakshaya");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);
    }

}
