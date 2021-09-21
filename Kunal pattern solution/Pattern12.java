import java.util.*;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int star=n;
        int space=0;
        for(int i=1;i<=2*n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            if(i<n){
                space+=1;
                star-=1;
            }if(i>=n+1){
                space-=1;
                star+=1;  
            }
            
            System.out.println();
        }
        s.close(); 
    }
}
