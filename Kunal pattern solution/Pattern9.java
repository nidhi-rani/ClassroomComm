import java.util.*;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int star=2*n-1;
        int space=0;;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            space+=1;
            star-=2;
            System.out.println();
        }
        s.close();
    }
}
