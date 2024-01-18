import java.util.Random;
import java.util.Scanner;
   
public class Main {
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


      // -----------------------------------------
      //            Task 
      // ------------------------------------------
        //Declare variables of type integer 
        int userChoice, computerChoice, rock, paper, scissors;
        //create random input for the computer
        Random rnd = new Random();  

        //Assigning values to the following variables:
        rock = 0;
        paper = 1;
        scissors = 2;


        //display the game name
        System.out.println("ROCK - PAPER - SCISSORRS GAME");
        System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
        //User input
        userChoice = sc.nextInt();
                 //if user chooses above 2
                while (userChoice > 2) {
              System.out.println("give number between 0 and 2");
              userChoice = sc.nextInt();
          }
         //user selections
         if (userChoice == rock)
         {
           System.out.println("User chose ROCK");
         }
        else
        {
          if(userChoice== paper)
          {
            System.out.println("User chose PAPER");
          }
          else
          {
            System.out.println("User chose SCISSORS");
          }
        }
        //computer input (random)
        computerChoice = rnd.nextInt(3);

        //computer selection
        if(computerChoice == rock)
        {
          System.out.println("Computer chose ROCK");
        }
        else
        {
          if(computerChoice == paper)
          {
            System.out.println("Computer chose PAPER");
          }
          else
          {
            System.out.println("Computer chose SCISSORS");
          }
        }

        //Results section

        //Draw
        while (userChoice == computerChoice) {
              System.out.println("draw try again");

              // if user chooses above 2
              userChoice = sc.nextInt();
              while (userChoice > 2) {
                System.out.println("give number between 0 and 2");
                userChoice = sc.nextInt();
                }
              computerChoice = rnd.nextInt(3);
               // DRAW user selections
                if (userChoice == rock)
                    {
                        System.out.println("User chose ROCK");
                    }
                else
                {
                    if(userChoice== paper)
                    {
                        System.out.println("User chose PAPER");
                    }
                    else
                    {
                        System.out.println("User chose SCISSORS");
                    }
        }      
         //DRAW computer selection
          if(computerChoice == rock)
              {
                  System.out.println("Computer chose ROCK");
              }
          else
              {
                  if(computerChoice == paper)
                  {
                      System.out.println("Computer chose PAPER");
                  }
                  else
                  {
                      System.out.println("Computer chose SCISSORS");
                  }
              }
          } //END DRAW

         //RESULTS
        if (computerChoice==rock)
          {
              if (userChoice==paper)
              {  
                  System.out.println("User wins!");
              }
              else 
              {
                  System.out.println("Computer Wins");
              }
          }
        else if (computerChoice==paper)
        {
          if (userChoice==rock)
              {
                  System.out.println("Computer wins");
              }
          else
              {
                  System.out.println("User Wins!");
              }
        }
        else if (userChoice==rock)
        {
          System.out.println("User Wins");
        }
        else
        {
            System.out.println("Computer Wins");
        } //END RESULTS

      sc.close();
      }//END main
       
    
    }
     



