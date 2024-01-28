package assimentarray;

public class Question3 {
    public static void fd(int arr[] ) {
       // int j=0;
       // int i=arr[j];
        for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[j]);
            }
         }
        
    }
}
    public static void main(String[] args) {
        int a[]={0,0,0,0,0,0,0,0,0};
        fd(a);

    }
    
}

