public class Teacher extends People {
    public Teacher(String name, String lastname, int age){
        super(name,lastname,age);
    }


    public void teach(){
        System.out.print("Teacher:" + " " + super.name + " ");
        System.out.print(super.lastname + " ");
        System.out.print("age:" + super.age + " ");
    }


}