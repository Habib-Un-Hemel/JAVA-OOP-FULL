package part2.StaticExample;

public class Main {
    public static  void main(String[] args){
        Human Hemel = new Human(24, "hemel" , 50000,true);
        Human Riha = new Human(21, "Riha" , 30000,true);

        System.out.println(Hemel.population);
        System.out.println(Riha.population);

        System.out.println(Human.population);

    }
}
