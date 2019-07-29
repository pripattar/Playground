import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int reverse=0;
    while(num!=0)
    {
    int digit=num%10;
    reverse=reverse*10+digit;
    num=num/10;
    }
    System.out.println(reverse);//Type your code here
  }
}