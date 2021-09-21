import java.util.*;
public class Pattern10 {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int star=1;
    int space=n-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=star;j++){
            System.out.print("* ");
        }
        space-=1;
        star+=1;
        System.out.println();
    }
    s.close();
   } 
}
