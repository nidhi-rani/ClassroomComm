import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int star=1;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<n)
              star++;
            else
              star--;
            System.out.println();
        }
        s.close();
    }
}
