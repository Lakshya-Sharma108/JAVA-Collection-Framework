package D_MapInterface;

public class Student {
    String name;
    int age;
    String address;
    String course;


    public Student(String name, int age, String address, String course) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.course = course;
    }

    public Student() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
