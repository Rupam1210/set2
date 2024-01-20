import java.util.Random;
import java.util.Scanner;
   
public class Main {
    public static void main(String[] args) {
      // -----------------------------------------
      //            Task 
      // ------------------------------------------
        //Declare variables of type integer 
       Scanner sc=new Scanner(System.in)
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
