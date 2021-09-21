import java.util.*;
public class Pattern17 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int space=n-1;
       int no=1;
       int v=1;
       for(int i=1;i<=2*n-1;i++){
           for(int j=1;j<=space;j++){
               System.out.print(" ");
           }
           int iv=v;
           for(int j=1;j<=no;j++){
               System.out.print(iv);
                if(j<=no/2){
                    iv--;
                }else{
                    iv++;
                }
           }
           if(i<n){
               space--;
               no+=2;
               v++;           
            }else{
               space++;
               no-=2;
               v--;
           }
           System.out.println();
       } 
       s.close();
    }
}
