import java.util.*;
public class Pattern30 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int star=1;
    int space=n-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++){
            System.out.print("  ");
        }
        int v=i;
        for(int j=1;j<=star;j++){
            System.out.print(v+" ");
            if(j<=star/2){
               v--;
            }else{
                v++;
            }
            
        }
        space-=1;
        star+=2;
        System.out.println();
    }
    s.close();
    }
    
}
