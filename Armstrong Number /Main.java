import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int arm=0,a,b,c,d,no;
      Scanner in=new Scanner(System.in);
      no=in.nextInt();
      d=no;
      while(no>0)
           {
            a=no%10;
            no=no/10;
            arm=arm+a*a*a;
           }
      if(arm==d)
          {
            System.out.println("Armstrong Number");
           }
       else
            {
             System.out.println("Not a Armstrong Number");
            }
	}
    }