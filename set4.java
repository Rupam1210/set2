import java.util.Random;
import java.util.Scanner;

public class set4 {
    public static void main(String[] args) {
        //  Question 1:
//         

        // Question 2
        System.out.println("Question 6");
       byte m1, m2, m3;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your marks in Physics");
       m1 = sc.nextByte();

       System.out.println("Enter your marks in Chemistry");
       m2= sc.nextByte();

       System.out.println("Enter your marks in Mathematics");
       m3 = sc.nextByte();
       float avg = (m1+m2+m3)/3.0f;
       System.out.println("Your Overall percentage is: " + avg);
       if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
           System.out.println("Congratulations, You have been promoted");
       }
       else{
           System.out.println("Sorry, You have not been promoted! Please try again.");
       }

        // Question 3
        System.out.println("Question 6");
       System.out.println("Enter your income in Lakhs per annum");
       float tax = 0;
       float income = sc.nextFloat();
       if(income<=2.5){
           tax = tax + 0;
       }
       else if(income>2.5f && income <= 5f){
           tax = tax + 0.05f * (income - 2.5f);
       }
       else if(income>5f && income <= 10.0f){
           tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax + 0.2f * (income - 5f);
       }
       else if(income>10.0f){
           tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax + 0.2f * (10.0f - 5f);
           tax = tax + 0.3f * (income - 10.0f);
       }

       System.out.println("The total tax paid by the employee is: " + tax);

//        Question 4:
System.out.println("Question 4");
System.out.println("Please enter the day");
      
       int day = sc.nextInt();


       switch (day){
           case 1 -> System.out.println("Monday");
           case 2 -> System.out.println("Tuesday");
           case 3 -> System.out.println("Wednesday");
           case 4 -> System.out.println("Thursday");
           case 5 -> System.out.println("Friday");
           case 6 -> System.out.println("Saturday");
           case 7 -> System.out.println("Sunday");

       }

       // Question 5
    //    ---------------
         boolean is_leap_year = false;
         System.out.println("Question 5");
         System.out.println("PLease enter the year");
         int year=sc.nextInt();
        
        if (year % 4 == 0) {
            is_leap_year = true;
 
            
            if (year % 100 == 0) {
                
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        else
            is_leap_year = false;
 
        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");

//        Question 6
System.out.println("Question 6");
System.out.println("enter the website name");
       String website = sc.next();
       if(website.endsWith(".org")){
           System.out.println("This is an organizational website");
       }
       else if(website.endsWith(".com")){
           System.out.println("This is a Commercial website");
       }
       else if(website.endsWith(".in")){
           System.out.println("This is an Indian website");
       }

    Random r = new Random();
    int a = r.nextInt();
        System.out.println(a);
        sc.close();

    }
    
}
