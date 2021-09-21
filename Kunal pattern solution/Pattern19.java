import java.util.*;
public class Pattern19 {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int space=2*n-2;
    int star=1;
    for(int i=1;i<=2*n-1;i++){
        for(int j=1;j<=star;j++){
            System.out.print("*");
        }
        for(int j=1;j<=space;j++){
           System.out.print(" ");
       }
       for(int j=1;j<=star;j++){
           System.out.print("*");
       }
       if(i<n){
           space-=2;
           star++;
       }if(i>=n){
           space+=2;
           star--;
       }
       System.out.println();
    }  
    s.close();
   } 
}
