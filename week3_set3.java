class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class rectangle{
    public int len;
  public int breadth;
    rectangle(){
        System.out.println("this is the rectangle class ");
    }
    rectangle(int l,int b){
        System.out.println("this is the reactangle with length  "+l+ "and breadth "+b);
        this.len = l;
      this.breadth = b;
    }

    public double area(){
        return this.len*this.breadth;
    }
  public int getlen(){
    return len;
  }
  public int setlen(int l){
    return len=l;
  }
  public int setbreadth(int b){
    return breadth=b;
  }
  public int getbreadth(){
    return breadth;
  }
}
class cubiod extends rectangle{
public int height;
  cubiod(){
    System.out.println("this is the cubiod class");
  }
  cubiod( int l,int b,int h){
    super(l,b);
    this.height=h;
    
    System.out.println("this is the cubiod class with a height"+h);
  }
  public int setheight(int h){
    return this.height=h;
  }
  public int getheight(){
    return height;
  }
  public double volume(){
      return this.height*this.len*this.breadth;
  }
}
public class Main {
    public static void main(String[] args) {
      //-------------------------
        // Problem 1
      //-----------------------
      System.out.println("Problem 1: Create a class circle and use inheritance to create another class cylinder from it   ");
        System.out.println();
        Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12, 4);
       System.out.println();
      //-------------------------
        // Problem 2
      //-----------------------
      System.out.println("Problem 2: Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible   ");
        System.out.println();
      rectangle rec=new rectangle(4,5);
      cubiod cub=new cubiod(6,4,5);
      
       System.out.println();
      //-------------------------
        // Problem 3
      //-----------------------
      System.out.println("Problem 3:Create a method for area and volume in 1    ");
        System.out.println();
      System.out.println("Area of circle "+String.format("%.2f", objC.area()));
       System.out.println("Volume of cylinder "+String.format("%.2f", obj.volume()));
      //-------------------------
        // Problem 4
      //-----------------------
       System.out.println();
      System.out.println("Problem 4: create methods for area & volume in 2 also create getters and setters  ");
      cub.setheight(6);
      System.out.println("height of cubiod "+cub.getheight());
      System.out.println("Area of rectangle "+String.format("%.2f", rec.area()) );
      
       System.out.println("volume of cubiod "+String.format("%.2f", cub.volume()) );
        System.out.println();
      //-------------------------
        // Problem 5
      //-----------------------
       System.out.println();
      System.out.println("Problem 5:What is the order of constructor execution for the following inheritance hierarchy ");
        System.out.println("base-> derivied1->derived2");
    }
}
//Create a class circle and use inheritance to create another class cylinder from it
// Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible 
// Create a method for area and volume in 1 
// create methods for area & volume in 2 also create getters and setters 
// What is the order of constructor execution for the following inheritance hierarchy 
//                     Base 

//                    Derived 1

//                    Derived 2

// Derived obj = new Derived 2( ); 
// Which constructor(s) will be executed & in what order?
