import java.util.*;
public class Pattern31 {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int ov=n;
       n=2*n-1;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               int value=ov-Math.min(Math.min(i,j),Math.min(n-i-1,n-j-1));
               System.out.print(value+" ");
           }
           System.out.println();
       }
       s.close();
   } 
}
