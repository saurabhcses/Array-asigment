package assimentarray;
import java.util.*;
public class Que16 {
    public static int fact(int a[]) {
        int answer=1;
        for(int i=1;i<a.length;i++){
            answer=answer*a[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for (int i = 1; i < a.length; i++) {
            a[i]=i;
            
        }
        System.out.println(fact(a));
    }
    
}
