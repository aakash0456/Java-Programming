public class variableArgument {
    
     static void show(int ...x)
     {
         for(int no : x)
      {
          System.out.print(no);      }
     }
    public static void main(String args[]) {
     show(1,2,3,4);
      
    }
}