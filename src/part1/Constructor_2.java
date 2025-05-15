package part1;

public class Constructor_2 {

    static class Student {
        int id;
        String name;
        float marks;

        void greeting(){
//      both correct      System.out.println("greetings from "+ this.name);
            System.out.println("greetings from "+ name);

        }
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

//        this is a constructor
//        Car(int Car_id, String Car_Name, String Car_Color){
//            this.id = Car_id;
//            this.name = Car_Name;
//            this.color = Car_Color;
//        }
        Car(int Car_id, String Car_Name, String Car_Color){
            id = Car_id;
            name = Car_Name;
            color = Car_Color;
        }
    }

    public static  void main (String[] args
    ){
        System.out.println("Constructor will be learned ");

        Student s1 = new Student();
        s1.greeting();
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        System.out.println("------------------");

        //car class object1
        Car c1 = new Car(1, "BMW", "White" );
        System.out.println(c1.id);
        System.out.println(c1.name);
        System.out.println(c1.color);

        System.out.println("------------------");

        //car class object2
        Car c2 = new Car(2, "toyota", "red" );
        System.out.println(c2.id);
        System.out.println(c2.name);
        System.out.println(c2.color);
    }
}
