import java.util.*;
public class Pattern25 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int os=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=os;j++){
                System.out.print(" ");
            }  
            if(i==1 || i==n){
               for(int j=1;j<=n;j++){
                   System.out.print("*");
               }  
            }else{
               for(int j=1;j<=n;j++){
                   if(j==1 || j==n)
                      System.out.print("*");
                   else
                   System.out.print(" ");
               }
            } 
            os--;
           System.out.println();
        }  
        s.close();
    }
}
