package Encapsulation;

public class StudentCallerClass {

    public static void main(String[] args){
        Student s1= new Student();
        s1.setName("chhavi raj");
        s1.setAge(19);
        if(s1.getAge()>18){
            System.out.println("Hii "+s1.getName()+" you can watch this movies");
        }
        else{
            System.out.println("hii "+s1.getName()+" you cannt vote");
        }

    }
}
