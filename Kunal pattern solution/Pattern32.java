import java.util.*;
public class Pattern32 {
   public static void main(String []args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int c=64+n;
    for(int i=1;i<=n;i++){
         int chr=c;
        for(int j=1;j<=i;j++){
            System.out.print((char)chr+" ");
            chr++;
        }
        c--;
        System.out.println();
    }
    s.close();
   } 
}

