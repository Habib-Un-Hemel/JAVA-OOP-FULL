package part1;

public class CallingAConstructorWithAnotherConstructor_4 {
    static   class Student{
        int id;
        String name;

        Student(){
            this(2,"Tiger");
        }

        //constructor overloading
        Student(int roll, String amrNam){
            id = roll;
            name = amrNam;
        }
    }
    public static  void main(String args[]){

        Student s1 = new Student();
        System.out.println(s1.name);

        System.out.println("++++++++++++++++++");

        Student s2  = new Student(100, "RihaQueen");
        System.out.println(s2.name);
    }
}

