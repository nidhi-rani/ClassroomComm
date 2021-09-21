import java.util.*;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=1;i<=n;i++){
         if(i==1 || i==n){
            for(int j=1;j<=n-1;j++){
                System.out.print("*");
            }  
         }else{
            for(int j=1;j<=n-1;j++){
                if(j==1 || j==n-1)
                   System.out.print("*");
                else
                System.out.print(" ");
            }
         } 
        System.out.println();
     }  
     s.close();
    }
}
