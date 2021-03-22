package Opps;

public class PassByValue {
    public static void main(String[] args){
       // int c=9;
        //int d=3;
      //  swap(c,d);
       // System.out.println(c+" +"+d);
        Dog c=new Dog();
        Dog d=new Dog();
        c.legs=3;
        d.legs=4;
        swap(c,d);
        System.out.println(c.legs+" "+d.legs);

    }
    static void swap(int c,int d){
        int temp;
        temp=c;
        c=d;
        d=temp;
    }
    static void swap(Dog a,Dog b){
        Dog temp=a;
        a=b;
        b=temp;
    }
}
class Dog{
    int legs;
}
