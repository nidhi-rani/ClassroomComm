import java.util.*;
public class Pattern22 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int v=1;
        for(int i=1;i<=n;i++){
            int vj=v;
            for(int j=1;j<=i;j++){
                 System.out.print(vj+" "); 
                 vj=vj==1?0:1;
            }
            v=v==1?0:1;
           System.out.println();
        }  
        s.close();
    }
}
