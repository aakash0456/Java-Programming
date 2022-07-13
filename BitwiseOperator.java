import java.lang.*;

class BitwiseOperator
{
  public static void main(String args[])
  {
    int x=10, y=6, z,z1,z2,z3,z4;
    z=x&y;
    z1=x|y;
    z2=x^y;
    z3=x<<1;
    z4=x>>1;
    System.out.println("AND & " + z);
    System.out.println("OR | " + z1);
    System.out.println("XOR ^" + z2);
    System.out.println("LS <<" + z3);
    System.out.println("RS >>" + z4);
   }
}
    