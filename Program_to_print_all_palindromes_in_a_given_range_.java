import java.util.Scanner;
class classnam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,arr[],a,b,temp,d,sum=0;
    a=sc.nextInt();
    b=sc.nextInt();
    arr=new int[100];
    if(a<b)
    {
    for(i=a;i<=b;i++)
    {
        temp=i;
        sum=0;
        while(temp!=0)
        {
        d=temp%10;
        temp=temp/10;
        sum=sum*10+d;
        }
        if(i==sum)
        {
            System.out.print(i+" ");
        }
    }
    }
    }
}