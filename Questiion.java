package assimentarray;

public class Questiion {
    public static int product(int a[]) {
        int b=1;
        for(int i=0;i<a.length;i++){
            b=b*a[i];
        }
        
    
    return b;
}

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        System.out.println(product(a));
    }
    
}
