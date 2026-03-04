


import java.util.Scanner;
 
public class Main {
   public static void main (String[]args)
   {
      Scanner sc = new 
      Scanner(System.in);
            System.out.println("enter your marks:");
            int marks = sc.nextInt();
            if (marks >=90) {
      System.out.println("Excellent");
            } else if (marks >= 40 ) {
                  System.out.println("Pass");
            } else {
               System.out.println("Fail");
            }
            sc.close();
   }
}