import java.util.*;
public class Pattern13 {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int innerspace=-1;
    int outerspace=n-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=outerspace;j++){
            System.out.print(" ");
        }
        if(i!=n)
         System.out.print("*");
        if(i>1 && i<n){
            for(int j=1;j<=innerspace;j++){
                System.out.print(" ");
                }
            System.out.print("*");
        }
        else if(i==n){
            for(int j=1;j<=2*n-1;j++){
                System.out.print("*");
            } 
        }
        innerspace+=2;
        outerspace-=1;
        System.out.println(); 
      }
    s.close(); 
   } 
}
