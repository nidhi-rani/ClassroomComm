import java.util.*;
public class Pattern26{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int v=1;
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(v+" ");
            }
            v++;
            System.out.println();
        }
        s.close();
    }
}
