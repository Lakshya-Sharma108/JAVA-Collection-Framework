package D_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "Lakshaya");
        map1.put(102, "jethalal");
        map1.put(103, "popatlal");
        map1.put(104, "kirmada");

        System.out.println(map1+"\n");

        System.out.println(map1.get(101));
        System.out.println(map1.get(102));
        System.out.println(map1.get(103));
        System.out.println(map1.get(104)+"\n");

        //System.out.println(map1.getOrDefault(0, "jethalal"));


        // first way
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(101, new Student("Lakshaya", 20, "Bharatpur", "Java fullStack"));
        studentMap.put(102, new Student("Yogi", 22, "Dholpur", "Java fullStack"));
        studentMap.put(103, new Student("Bheeshm", 21, "Bharatpur", "Java fullStack"));

        System.out.println(studentMap);

        // second way
        Student student_2 = new Student();
        student_2.setName("Shruti");
        student_2.setAge(19);
        student_2.setAddress("Jaipur");
        student_2.setCourse("XYZ");

        studentMap.put(104, student_2);
        System.out.println("\n"+studentMap.get(104)+"\n");


        // Iterating a Map
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()){
            int key = entry.getKey();
            Student value = entry.getValue();
            System.out.println("Key : "+key);
            System.out.println("Name = "+value.getName()+", Age = "+value.getAge()+", Address = "+value.getAddress()+
                                ", Course = "+value.getCourse());
        }
    }
}
