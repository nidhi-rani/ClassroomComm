import java.util.*;
public class Pattern27 {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int firsthalf=1;
       int secondhalf=n*n+1;
       int innerloop=2*n;
       int space=0;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=space;j++){
               System.out.print(" ");
           }
            for(int j=1;j<=innerloop;j++){
                if(j<=innerloop/2){//here space is managed according to sample question only.We have to handle spaces a/c to digits present in no.
                    if(firsthalf<10)
                       System.out.print(firsthalf+" ");
                    else
                       System.out.print(firsthalf);
                    firsthalf++;
                }else{
                    System.out.print(" ");
                    System.out.print(secondhalf+" ");
                    secondhalf++;
                }
             }
             innerloop-=2;
             secondhalf=secondhalf-innerloop-1;
             space+=2;
             System.out.println();
       }
     s.close();   
   } 
}
