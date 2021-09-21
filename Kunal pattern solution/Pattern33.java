import java.util.*;
public class Pattern33 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       char c='a';
       boolean b=true;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(b){
                System.out.print(Character.toLowerCase(c)+" ");
                b=false;
            }else{
                System.out.print(Character.toUpperCase(c)+" ");
                b=true;
            }
            c++;
        }
        System.out.println();
    }
    s.close();
    }
}
