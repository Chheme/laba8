public class Student extends People {
    public Student(String name, String lastname, int age){
        super(name,lastname,age);
    }
    public void learn(){
        System.out.print("Student:"+ " " + super.name + " ");
        System.out.print(super.lastname + " ");
        System.out.println("age:" + super.age);
    }


}