import java.util.*;
public class Pattern23 {
   public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int os=n-1;
      int is=2*n-3;
      int star=1;
      for(int i=1;i<=n;i++){
          for(int j=1;j<=os;j++){
               System.out.print(" ");
          }
          for(int j=1;j<=star;j++){
              if(j>1 && j<star)
                 System.out.print(" ");
               else
                 System.out.print("*");
          }
          for(int j=1;j<=is;j++){
             System.out.print(" ");
          }
          for(int j=1;j<=star;j++){
             if(i==n){
                if(j==star-1)
                  System.out.print("*"); 
                else
                 System.out.print(" ");
             }
             else{
               if(j>1 && j<star){
                  System.out.print(" ");
               }
               else{
                 System.out.print("*"); 
               }
             }
               
          }
          os--;
          star+=2;
          is-=2;
          System.out.println();
      }  
    s.close();   
   }  
}
