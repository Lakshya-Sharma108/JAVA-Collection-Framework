package E_ComparableInterface;

public class Student implements Comparable<Student> {
    public String name;
    public int age;
    public int weight;

    public Student(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }


    // overriding the compareTo method of comparable class
    // it can only return negative integer, zero or positive integer

    @Override
    public int compareTo(Student that) {
        // this method is called for current object
        /// custom sorting logic

        // if the age of two or more is same
        if (this.age == that.age){
            return this.name.compareTo(that.name);
        }

        // sorting on the basis on age
        return that.age - this.age;
    }
    
}
