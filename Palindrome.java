import java.util.Scanner;
class P
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev)
            System.out.print("True");
        else
            System.out.print("False");
    }
}