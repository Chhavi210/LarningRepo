package BitManupulation.Question;
//find the only non repeating element in an array where every element repeat twice except one element
public class Q1 {
    public static void main(String[] args){
        int a[]={5,4,1,4,3,5,1};
        int result=0^a[0];
        for(int i=1;i<a.length;i++){
            result=result^a[i];
        }
        System.out.println("the non repeating element is "+result);
    }
}
