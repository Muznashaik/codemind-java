import java.util.Scanner;
class M
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=0,b=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                a=a+i;
            }
        }
        for(int j=1;j<m;j++)
        {
            if(m%j==0)
            {
                b=b+j;
            }
        }
        if(b==n && a==m)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}