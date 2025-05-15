package part1;

public class Object_Class_1 {

    // Step1 -> Object created with default values
    static class Student{
        int id;
        String name;
        float marks;
    }


    //step2 -> Object created with some values after declaration and initialization
    static  class Car {
        int model = 1231;
        String name = "BMW";
        String color = "RED";
    }

    //Step3 -> Object manipulation after initialization
    static  class Cat {
        String bread = "Persian";
        String name = "Meuko";
        int leg = 4;
    }

    //Step4
    // can we create a object with some given id , name , marks in the first place? => yes, we can

    public static  void main( String[ ] args){
        System.out.println("hello world");

        //Student class
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        System.out.println("------------");
        // Car Class
        Car c1 = new Car();
        System.out.println(c1.model);
        System.out.println(c1.name);
        System.out.println(c1.color);

        //Cat class
        System.out.println("------------");
        Cat cat1 = new Cat();
        cat1.name = "Tommy";
        System.out.println(cat1.bread);
        System.out.println(cat1.name);
        System.out.println(cat1.leg);


    }
}

