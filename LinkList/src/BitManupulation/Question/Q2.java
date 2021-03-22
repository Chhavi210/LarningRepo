package BitManupulation.Question;
//find the two on repeating element in the array where every element repeat twice
public class Q2 {
    public static void main(String[] args) {
        int a[] = {5, 4, 1, 4,3, 5, 1,9};
        int result = 0 ^ a[0];
        for (int i = 1; i < a.length; i++) {
            result ^=a[i];
        }
        int count=0;
        int temp=result;
        while((temp&1)!=1){
            count++;
          temp>>=1;
        }
        temp=result;
        int check[]=new int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(((a[i]>>count)&1)==1){
                check[k++]=a[i];

            }

        }
        for(int i=0;i<k;i++){
            temp^=check[i];
        }
        System.out.println(temp);
        System.out.println(temp^result);
    }
}
