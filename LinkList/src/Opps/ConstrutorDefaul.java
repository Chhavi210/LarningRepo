package Opps;

public class ConstrutorDefaul {
    public  static void main(String[] args){
        Dog d1=new Dog("brown");
        System.out.println(" my dog has "+d1.legs+" legs");
        System.out.println(" my dog has "+d1.colour+" colour");
        System.out.println(" my dog has "+d1.eyes+" eyes");
        Dog d2=new Dog();

        System.out.println(" my dog has "+d2.legs+" legs");
        System.out.println(" my dog has "+d2.colour+" colour");
        System.out.println(" my dog has "+d2.eyes+" eyes");


    }
     static class Dog{
        int legs;
        int eyes;
        String colour;
        Dog(){

        }
        Dog(String colour){
            System.out.println("your in constructor");
             this.colour=colour;
            this.eyes=2;
            this.legs=4;
        }


    }
}
