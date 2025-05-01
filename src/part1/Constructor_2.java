package part1;

public class Constructor_2 {

    static class Student {
        int id;
        String name;
        float marks;

        //this is a constructor
        Student(){
            this.id = 1198;
            this.name = "Hemel";
            this.marks = 91.02f;
        }
    }
    static class Car {
        int id;
        String name;
        String color;

        //this is a constructor
        Car(int Car_id, String Car_Name, String Car_Color){
            this.id = Car_id;
            this.name = Car_Name;
            this.color = Car_Color;
        }
    }




    public static  void main (String[] args
    ){
        System.out.println("Constructor will be learned ");

        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        System.out.println("------------------");

        //car class
        Car c1 = new Car(1, "BMW", "White" );
        System.out.println(c1.id);
        System.out.println(c1.name);
        System.out.println(c1.color);
    }
}
