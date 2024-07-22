import java.util.Scanner;
public class Matrix
{
   
     
        Scanner sc = new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        System.out.println("Enter first matrix");
        for(int i=0;i<2;i++)
          {
              for(int j=0;j<2;j++)
                  {
                      a[i][j]=sc.nextInt();
                  }
          }
        System.out.println("Enter Second matrix:");
        for(int i=0;i<2;i++)
          {
              for(int j=0;j<2;j++)
                 {
                     b[i][j]=sc.nextInt();
                 }
          }
        void show()
         {
             for(int i=0;i<2;i++)
             {
                for(int j=0;j<2;j++)
                  {
                     System.out.println(a[i][j]+" ");
                  }
             }
             for(int i=0;i<2;i++)
             {
                 for(int j=0;j<2;j++)
                  {
                     System.out.println(b[i]

          }  
     
}
        
class Operations
{
      public static void main(String [] args)
      {
          Matrix m=new Matrix();
          m.show();
          m.add();
          m.sub();
      }
}