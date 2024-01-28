package assimentarray;

public class Ques10 {
    public static void sumdif(int a[]) {
        int sm=1;
        int incsum=0;
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                sm=2*a[i];
                a[i]=sm;

            }
            else{
                incsum=a[i]+10;
                a[i]=incsum;
            }

    
        }
       // System.out.println(oddsum);
        //System.out.println(evensum);
        
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        sumdif(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}