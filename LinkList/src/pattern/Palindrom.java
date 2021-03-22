package pattern;

public class Palindrom {
    public static  void main(String[] args){
        int n=2432;
        int rev=0;
        int m=n;
        while(m>0){
            int r=m%10;
            rev=rev*10+r;
            m=m/10;
        }
        if(n==rev){
            System.out.println(" number is pelindromes");
        }
        else{
            System.out.println("number is not pelindrome");
        }
    }
}
