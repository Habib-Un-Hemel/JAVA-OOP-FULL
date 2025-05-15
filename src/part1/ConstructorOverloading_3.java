package part1;

public class ConstructorOverloading_3 {


    static   class Student{
        int id;
        String name;

        Student(){
            id = 12;
            name = "hemel king";
        }

        //constructor overloading
        Student(int roll, String amrNam){
            id = roll;
            name = amrNam;
        }
    }
    public static  void main(String args[]){
        System.out.println("Constructor overloading");

        Student s1 = new Student();
        System.out.println(s1.name);

        System.out.println("++++++++++++++++++");

        Student s2  = new Student(100, "RihaQueen");
        System.out.println(s2.name);
    }
}
