import java.lang.*;
import java.util.*;

class PrintString
{
  public static void main(String args[])
  { 
    String str1 = "hello";
    char c[] = {'h','e','l','l','o'};
    byte b[] = {65,66,67,68}; // not working need to check
    String str2 = new String("hello");
    String str3 = new String(b);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(c);
    System.out.println(b);

    String  str4 = "JAVA";
    str4=str4.toLowerCase();
    System.out.println(str4);

     String s = "programmer@gmail.com";
     System.out.println(s.endsWith("gmail.com"));
     String a = s.substring(0,10); // 0 is starting index and 10 is length
     System.out.println(a);
  }
}