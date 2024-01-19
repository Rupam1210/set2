public class set5 {
    public static void main(String[] args) {
        // Practice Problem 1
        System.out.println("Ouestion 1");
       int n = 4;
       for (int i=n; i>0; i--){
           for(int j=0;j<i;j++){
               System.out.print("*");
           }
           System.out.print("\n");
       }

        // Practice Problem 2
        System.out.println("Ouestion 2");
       int sum=0;
       int n2=4;
       for(int i=0;i<n2;i++){
           sum = sum + (2*i);
       }
       System.out.print("Sum of even numbers is: ");
       System.out.println(sum);
         

        // Practice Problem 3
        // -----------------------

        System.out.println("Ouestion 3");
       int n3 = 5;
       //for(int i=0; i<10; i++) - Goes from i=0 to i=9
       for(int i=1;i<=10;i++){
           System.out.printf("%d X %d = %d\n", n3, i, n3*i);
       }

        // Practice Problem 4
        // --------------------

        System.out.println("Ouestion 4");
       int n4 = 10;
       //for(int i=0; i<10; i++) - Goes from i=0 to i=9
       for(int i=10;i>=1;i--){
           System.out.printf("%d X %d = %d\n", n4, i, n4*i);
       }
    //  pratice probelm-5
    // ------------------

    System.out.println("Ouestion 5");
    System.out.println("factorial of 6");
    int s=6;
    int fact=1;
    for(int i=1;i<=s;i++){
        fact*=i;
    }
    System.out.println(fact);
        // Practice Problem 6
        // --------------------------
        System.out.println("Ouestion 6");
       int n6 = 5;
       int i = 1;
       int factorial = 1;
       while(i<=n6){
           factorial *= i;
           i++;
       }
       System.out.println(factorial);

       // Practice Problem 7
        // --------------------------
        System.out.println("Ouestion 7");
        int n7 = 8;
        while(n7>0){
            int j=0;
            while(j<n7){
                System.out.print("*");
                j++;
            }
            n7--;
            System.out.println("\n");
        }
        
 

        // Practice Problem 9
        // --------------------------
        System.out.println("Question 9");
        sum=0;
        for(int m=1;m<=8;m++){
            sum+=8*i;
        }
        System.out.println("Sum of the number in multiplication of table 8 is "+sum);
        // Practice Problem 11
        System.out.println("Ouestion 11");
        int sum11=0;
        int n11=10;
        for(int o=0;o<n11;o++){
            if(o%2==0){
                sum11+=o;
            }
        }
       
       System.out.println("Sum of the first even no. of "+n11+" is "+sum11);


    }
}
