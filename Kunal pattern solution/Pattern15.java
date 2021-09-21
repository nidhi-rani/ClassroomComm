import java.util.*;
public class Pattern15 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int outerspace=n-1;
    int innerspace=-1;
    for(int i=1;i<=2*n-1;i++){
        for(int j=1;j<=outerspace;j++){
            System.out.print(" ");
        }
        System.out.print("*");
        if(i>1 && i<2*n-1){
            for(int j=1;j<=innerspace;j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        if(i<n){
            outerspace--;
            innerspace+=2;
        }else{
            outerspace++;
            innerspace-=2;
        }
        System.out.println();
    }
    s.close();
  }  
}
