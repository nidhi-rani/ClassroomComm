import java.util.*;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int star=n;
        int space=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            space+=1;
            star-=1;
            System.out.println();
        }
        s.close();
    }
}
