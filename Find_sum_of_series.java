import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        float k=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            k=k+((float)1/i);
        }
        System.out.format("%.2f",k);
    }
}