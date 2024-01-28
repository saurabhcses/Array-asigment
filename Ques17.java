package assimentarray;

public class Ques17 {
    public static int fisrtnonreapinting(int a[]) {
        int t=0;
        for (int i = 0; i < a.length; i++) {
            t=a[i]^t;
           
        }
        return t;
    }
        public static void main(String[] args) {
            int a[]={1,1,2,3,2,3,4};
            System.out.println(fisrtnonreapinting(a));
        }
        
    }
    

