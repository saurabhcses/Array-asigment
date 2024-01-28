package assimentarray;
import java.util.*;
public class Que3 {
    public static int minimum(int arr[]) {
        int a=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(a>arr[i]){
                a=arr[i];
            }
        }
        return a;
        
    }
    public static void main(String[] args) {
     int a[]={9,8,10,7,11,14,3} ;
     System.out.println(minimum(a));
    }
    
}
