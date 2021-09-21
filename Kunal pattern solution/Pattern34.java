import java.util.*;
public class Pattern34 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=64+n;
        for(int i=n;i>=1;i--){
            int chr=c;
            for(int j=i;j>=1;j--){
                System.out.print((char)chr+" ");
                chr--;
            }
            c--;
            System.out.println();
        }
        s.close();
    }
}
