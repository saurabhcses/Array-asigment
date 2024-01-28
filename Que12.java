package assimentarray;

public class Que12 {
    public static boolean cheaker(int a[]) {
        int i=0;
        int j=a.length-1;
         while(i<=j){
            if(a[i]==a[j]){
                return true;
            
            }
            i++;
            j--;
        }
    
        return false;
    }
    public static void main(String[] args) {
       int a[]={1,2,3,4} ;
       cheaker(a);
       if(cheaker(a)==true){
        System.out.println("is pelendrom");
       }
       else{
        System.out.println("is not pelendrom");
       }
    }
}
    

