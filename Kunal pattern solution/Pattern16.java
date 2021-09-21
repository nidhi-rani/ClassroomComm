import java.util.*;
public class Pattern16 {
  public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int space=n-1;
      int c=1;
      for(int i=0;i<n;i++){
          for(int j=0;j<space;j++){
              System.out.print(" ");
          }
          int val=1;
          for(int j=0;j<c;j++){
               System.out.print(val+" ");
               val=val*(i-j)/(j+1);
            }
          space-=1;
          c++;
          System.out.println();
      }
      s.close();
  }  
}
