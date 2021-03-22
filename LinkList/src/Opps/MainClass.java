package Opps;

class Cat{
    boolean hasFur;
    String color;
    String breed;
    int legs,eyes;
    public void walk(){
        System.out.println("cat is walking");

    }
    public void eat(){
        System.out.println("cat is eating");
    }
    public void Description(){
        System.out.println("my cat has "+legs+" legs and "+eyes+" eyes");
    }
}
public class MainClass {
    public static void main(String[] args){
        Cat c1=new Cat();;
        c1.walk();
        c1.color="white";
        c1.legs=4;
        c1.eyes=2;
        c1.Description();


    }
}
