import java.util.Scanner;

public class set2 {

    public static void main(String[] args) {

        // ------------------
        //     Question 1
        // ------------------
        System.out.println("Question 1");
        float ab= 7/4.0f * 9/2.0f;
        System.out.println(ab);

                // ------------------
                //     Question 2
                // ------------------
       System.out.println("Question 2");
        char grade='B';
        System.out.println("Character which is to be incrpty with 8 val"+grade);
        grade=(char)(grade+8);
        System.out.println(grade);
        System.out.println(" Decrypting the grade");
        grade=(char)(grade-8);
        System.out.println(grade);


                // ------------------
                //     Question 3
                // ------------------
        System.out.println("Question 3");
        int given=34;
        Scanner sc =new Scanner(System.in);
        int input =sc.nextInt();
        System.out.println(given>input);
        
                // ------------------
                //     Question 4
                // ------------------
        System.out.println("Question 4");
        System.out.println("Expression v^2-u^2/2as in Java");
        double v=5.0;
        double u=2.0;
        double a=3.0;
        double s=4.0;
        double result=(Math.pow(v,2)-Math.pow(u, 2))/(2*a*s);
        System.out.println(result);

        
                // ------------------
                //     Question 5
                // ------------------
        System.out.println("Question 5");
        System.out.println(7*49/7+35/7);
        sc.close();
   

    }
}