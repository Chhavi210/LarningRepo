package SetInterface;

public class SubArrayWithZeroesSum {
    public static void main(String[] args){
        int[] a={2,1,-3,4,2};
        boolean found=false ;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum==0){
                    found=true;
                    break;
                }
            }
            if(found)break;
        }
        System.out.println("found "+found);
    }
}
