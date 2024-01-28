package assimentarray;

public class Que8 {
    public static boolean sortedc(int a[]) {
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
           
            return false;
        
            
            }
           

        }

       
return true;
        
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,};
        sortedc(a);
        if(sortedc(a)==true){
            System.out.println("sorted");

        }
        else{
            System.out.println("not sorted");
        }
    }
    
}
