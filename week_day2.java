class Main {
  public static void main(String[] args) {
 
    // Practice Problem 1
    System.out.println("Question 1");
     float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
    float sum = 0;
    for(float element:marks){
        sum = sum + element;
    }
    System.out.println("The value of sum is " + sum);


    // Practice Problem 2
    System.out.println("Question 2 :find out whether a given integer is present in an array or not.");
    float [] marks2 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
    float num = 45.57f;
    boolean isInArray = false;
    for(float element:marks2){
        if(num==element){
            isInArray = true;
            break;
        }
    }
    if(isInArray){
        System.out.println("The value is present in the array");
    }
    else{
        System.out.println("The value is not present in the array");
    }


    // Practice Problem 3
    System.out.println("Question 3 :the average marks from an array containing marks of all students in physics using a for-each loop.");
    float [] mark = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
    float sums = 0;
    for(float element:marks){
        sums = sums + element;
    }
    System.out.println("The value of average marks is " + sums/mark.length);


    // Practice Problem 4
    System.out.println("Question 4 to add two matrices of size 2x3.");
    int [][] mat1 = {{1, 2, 3},
                     {4, 5, 6}};
    int [][] mat2 = {{2, 6, 13},
                     {3, 7, 1}};
    int [][] result = {{0, 0, 0},
                       {0, 0, 0}};

    for (int i=0;i<mat1.length;i++){ // row number of times
        for (int j=0;j<mat1[i].length;j++) { // column number of time
            System.out.format(" Setting value for i=%d and j=%d\n", i, j);
            result[i][j] = mat1[i][j] + mat2[i][j];
        }
    }

    // Printing the elements of a 2-D Array
    for (int i=0;i<mat1.length;i++){ // row number of times
        for (int j=0;j<mat1[i].length;j++) { // column number of time
            System.out.print(result[i][j] + " ");
            result[i][j] = mat1[i][j] + mat2[i][j];
        }
        System.out.println(""); // Prints a new line
    }

    // Practice Problem 5
    System.out.println("Question 5 :to reverse an array.");
    int [] arr = {1, 21, 3, 4, 5, 34, 67};
    int l = arr.length;
    int n = Math.floorDiv(l, 2);
    int temp;

    for(int i=0; i<n; i++){
        // Swap a[i] and a[l-1-i]
        // a   b   temp
        // |4| |3| ||
        temp = arr[i];
        arr[i] = arr[l-i-1];
        arr[l-i-1] = temp;
    }

    for(int element: arr){
        System.out.print(element + " ");
    }
System.out.println("\n");
    // Practice Problem 6
    System.out.println("Question 6 :to find the maximum element in an array.");
    int [] a = {1, 2100, 3, 455, 5, 34, 67};
    int max = Integer.MIN_VALUE;
    for(int e: a){
        if(e>max){
            max = e;
        }
    }
    System.out.println("the value of the maximum element in this array is: "+ max);

    // Practice Problem 7
    System.out.println("Question 7 :to find the maximum element in a Java array.");
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);
    
    // Practice Problem 8
    System.out.println("Question 8 : find whether an array is sorted or not.");
    boolean isSorted = true;
    int [] ar = {1, 12, 3, 4, 5, 34, 67};
    for(int i=0;i<ar.length-1;i++){
        if(ar[i] > ar[i+1]){
            isSorted = false;
            break;
        }
    }
    if(isSorted){
        System.out.println("The Array is sorted");
    }
    else{
        System.out.println("The Array is not sorted");
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
