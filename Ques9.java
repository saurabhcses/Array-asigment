package assimentarray;

public class Ques9 {
    public static void sumdif(int a[]) {
        int evensum =0;
        int oddsum=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                evensum=evensum+a[i];

            }
            else{
                oddsum=oddsum+a[i];
            }

    
        }
        System.out.println(oddsum);
        System.out.println(evensum);
        System.out.println(evensum-oddsum);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        sumdif(a);
    }
    
}
