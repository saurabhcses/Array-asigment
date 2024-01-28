package assimentarray;
import java.util.*;
public class que6{
    public static void main(String[] args) {
        int a[]={51,3,4,10};
        int max=Integer.MIN_VALUE;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max2=max1;
             max1=max;
             max=a [i]  ;
             
            }
             else if(a[i]>max1){
                
                max2=max1;
                max1=a[i];

             }
             else if(a[i]>max2){
                max2=a[i];
             }

            

        }
        System.out.println(max+" "+max1+" "+max2);
        
    }
    
}


