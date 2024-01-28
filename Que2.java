package assimentarray;

public class Que2 {
    public static int sndlargest(int a[]) {
        int max=a[0];
        int ele=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                ele=max;
                max=a[i];
            }
            else if(a[i]>ele){// && a[i]<max){
              ele=a[i];
            }
        }
        return ele;

        
    }
    public static void main(String[] args) {
       int a[]={9,8,10,7,11,14,3} ;
       System.out.println(sndlargest(a));
    }
    
}
