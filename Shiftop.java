import java.lang.*;
import java.util.*;

class Shiftop
{
   public static void main(String args[])
  {
    int x=-10;
    x=x<<1;
    System.out.println("x=-10 left shift " +x);
    x=-10;
    x=x>>1;
    System.out.println("x=-10 right shift " +x);
    x=10;
    x=x>>>1;
    System.out.println("x=10 unsigned right  shift " +x);
    x=-10;
    x=~10;
    System.out.println("x=10 not x " +x);
  }

}


/*E:\MyJava>java Shiftop
x=10 left shift 20
x=10 right shift 5
x=-10 unsigned right  shift 2147483643
x=10 not x -11

E:\MyJava>javac Shiftop.java

E:\MyJava>java Shiftop
x=-10 left shift -20
x=-10 right shift -5
x=10 unsigned right  shift 5
x=-10 not x -11*/