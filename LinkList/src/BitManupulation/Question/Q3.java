package BitManupulation.Question;

import java.lang.reflect.Array;

//find only non repeating element in an array where every other element repeat thrice
public class Q3 {
    public static void main(String[] args){
        int a[]={2,2,1,90,1,1,2};
        int bit[]=new int[32];

        for(int i=0;i<a.length;i++){
            int count=0;
            int d=a[i];
            while(d>0){

                if((d&1)==1){
                    bit[count]+=1;
                }
                count++;
                d=d>>1;


            }
        }

            for(int i=0;i<bit.length;i++){
                if(bit[i]%3==0){
                    bit[i]=0;

                }
                else {
                    bit[i]=1;
                }
            }

            int result=0;
            for(int i=0;i<bit.length;i++){
                result=result+(bit[i]*(int) Math.pow(2,i));
            }
        System.out.println(result);

    }

    }

