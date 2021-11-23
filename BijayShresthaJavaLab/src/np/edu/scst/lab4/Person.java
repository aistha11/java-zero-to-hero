/*
    WAP that describes a class person. 
    It should have instance variables to record name, age and salary. 
    Create a person object. 
    Set and display its instance variables.

    Modify experiment 2 to show constructor overloading.
 */
package np.edu.scst.lab4;

public class Person {

    String name;
    int age;
    double salary;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Bijay Shrestha", 24);
        Person person2 = new Person(30000);
        System.out.println("Person 1");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Person 2");
        System.out.println("Salary: " + person2.salary);
    }
}

//public class Person {
//    String name;
//    int age;
//    double salary;
//    
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.name = "Bijay Shrestha";
//        person.age = 24;
//        person.salary = 30000;
//        System.out.println("Name: " + person.name);
//        System.out.println("Age: " + person.age);
//        System.out.println("Salary: " + person.salary);
//    }
//}
