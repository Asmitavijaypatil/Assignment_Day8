import java.util.Scanner;

public class Question5 {
public static void main(String args[]) {

for(int i=1; i<=5; i++){
   for(int j=1; j<=i; j++){
   System.out.print("  ");
   }
   for(int j=1; j<=10; j++){
   if(i==1 || i==5 || j==1 || j==10) {
   System.out.print("* ");
   }
   else{
       System.out.print("  ");
   }
}
 System.out.println();
}
}
}