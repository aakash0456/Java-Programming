import java.lang.*;
import java.util.*;

 class PrintfandFormat               //printf and format are same.  
{
   public static void main(String args[])
   {
    int x=10;
    float y=123.45f;
    char c = 'a';
    String str = "java";
    System.out.printf("Hello %d %f %c world\n ",x,y,c);
    System.out.printf("Hello %5d %f %c \n",x,y,c);
    System.out.format("Hello %05d %f %c %s\n",x,y,c,str);
    System.out.format("%1$d %2$c %3$s",x,c,str);    // 1,2,3 denote index or position op= 10 a java
  
   }
}