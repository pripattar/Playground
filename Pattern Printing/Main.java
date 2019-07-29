import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int column=sc.nextInt();
      for(int idx1=1;idx1<=row;idx1++)
      {
        for(int idx2=column;idx2>column-idx1;idx2--)
        {
          System.out.print(idx2);
        }
       for(int idx2=1;idx2<=column-idx1;idx2++)
       {
         System.out.print(row-idx1+1);
       }
        System.out.println();
    }
}
}
