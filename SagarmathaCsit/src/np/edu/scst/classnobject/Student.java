/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.classnobject;

/**
 *
 * @author dell
 */
public class Student {
    int id;
    String name;
    int classLevel;
    String college;

    public Student() {
        System.out.println("A Student is created");
    }
    
    

    public Student(int id, String name, int classLevel, String college) {
        this();
        this.id = id;
        this.name = name;
        this.classLevel = classLevel;
        this.college = college;
    }
    

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", classLevel=" + classLevel + ", college=" + college + '}';
    }
    
    public static void main(String[] args) {
        Student ram = new Student(1,"Ram", 10, "Sagarmatha");
        Student shyam = new Student(2,"Shyam", 10, "Sagarmatha");
        Student hari = new Student();
        System.out.println(ram);
        System.out.println(shyam);
        System.out.println(hari);
    }
}
