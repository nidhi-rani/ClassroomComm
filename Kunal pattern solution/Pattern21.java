import java.util.*;
public class Pattern21 {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int v=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(v<10)
             System.out.print(v+"  ");  
            else
             System.out.print(v+" "); 
            v++;
        }
       System.out.println();
    }  
    s.close();
   } 
}
