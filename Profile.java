import java.lang.*;
import java.util.*;

class Profile
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    //Scanner a = new Scanner(System.in);
    String name;
    int age;
    String city;
    System.out.println("Enter the name : ");
    name = s.nextLine();
    System.out.println("Enter the age : ");
    age = s.nextInt();
    s.nextLine();
    System.out.println("Enter the city : ");
    city = s.nextLine();
    System.out.println("yr name is  : " + name);
    System.out.println("yr age is : "  +age);
    System.out.println("yr city is  : " + city);
   }
}
  