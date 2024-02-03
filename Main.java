package calc;
 
 
   class calculator{
        void add(int a,int b){
            System.out.println("sum is : "+(a+b));
        }
        void sub(int a,int b){
            System.out.println("subtraction is: "+(a-b));
        }
        void multiplication(int a,int b){
            System.out.println("multiplication is: "+(a*b));
        }
        void divide(int a,int b){
            System.out.println(a+"is divide by "+b+"and value is"+(a/b));
        }
    }
    class Scicalculator{
        void sin(double a){
            System.out.println("sin of"+a+"is :"+Math.sin(a));
        }
        void cos(double a){
            System.out.println("sin of"+a+"is :"+Math.cos(a));
        }
        void log10(double a){
            System.out.println("sin of"+a+"is :"+Math.log10(a));
        }
         
    }
    class Hybirdcalculator{
        void add(double a,double b){
            System.out.println("sum is"+(a+b));
        }
         
        void multiplication(double a,double b){
            System.out.println("multiplication is"+(a*b));
        }
        void divide(double a,double b){
            if(b==0){
                System.out.println("It cannot be divided");
            }else{
            System.out.println(a+"is divide by "+b+"and value is"+(a/b));}
        }
    }
  
  
public class Main {

    public static void main(String[] args) {
        System.out.println("new");
      //   calculator c=new calculator();
      //   c.add(2, 3);
      //   Scanner sc=new Scanner(System.in);
      //   System.out.println("Problem 2 :::");        System.out.println("Please write something");

      //   String s=sc.nextLine();
      //   System.out.println("Your Input is as "+s);
      // System.out.println("Problem 2 :::");  
      // InnerProblem4 c=new InnerProblem4();



        
    }

}
 