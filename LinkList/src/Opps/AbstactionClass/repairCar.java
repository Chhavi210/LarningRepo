package Opps.AbstactionClass;

public class repairCar {
    public static void repair(Car car){
        System.out.println("car is Repaired");
    }
    public static void main(String[] args){

        WagonR w1=new WagonR();
        Audi a1=new Audi();
        repair(w1);
        repair(a1);
    }
}
