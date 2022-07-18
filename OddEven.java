import java.lang.*;
import java.util.*;

class OddEven
{
  public static void main(String args[])
  {  
   int a;
    Scanner s  = new Scanner(System.in);
    System.out.println("enter the no :");
    a=s.nextInt();
    if(a%2==0)
	{

    	System.out.println("Even");
	}
    else
    {
      System.out.println("False");  
    }
  }
}