import java.util.*;
class M
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int max=0,r;
        while(n>0)
        {
            r=n%10;
            if(r>max)
            {
                max=r;
            }
            n=n/10;
        }
        System.out.print(max);
    }
}