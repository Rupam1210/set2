// package calc;
import java.util.Scanner;
import prob.*;
import calc.*;
class InnerProblem4 extends Problem3 {
      void Problem3(){
          System.out.println(a);
          // System.out.println(b);
      }


  }
public class Run {

    public static void main(String[] args) {
      
        System.out.println(" three classes calculator , Sc calculator and Hybridcalculator and group them into a package ");
        calculator c=new calculator();
        Scicalculator input=new Scicalculator();
       input.sin(2);
        c.add(2, 3);
        Scanner sc=new Scanner(System.in);
        System.out.println("Problem 2 Use a build-in package in java to write a class which displays a message ( by using sout ) after taking input from the user");        System.out.println("Please write something");

        String s=sc.nextLine();
        System.out.println("Your Input is as :"+s);
      System.out.println("Problem 3 : ");  
      System.out.println();


      Problem3  pb=new Problem3();
      String []arr={""};
    pb.main(arr);
      
       // It will show error if we use default value in subclasss
        InnerProblem4 d=new InnerProblem4();
      


        
    }

}
 