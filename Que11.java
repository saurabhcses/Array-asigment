package assimentarray;

public class Que11 {
    public static int uniq(int a[]) {
        //int j=0;
        int t=0;
        for(int i=0;i<a.length;i++){
           t=t^a[i];

            }
            

        
        
        
        return t;
    }
    
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,4,3,4,5,6,7,9,6,7,5};
        System.out.println(uniq(a));
        
    }
}
