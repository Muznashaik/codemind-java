import java.lang.Math;
import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        float Ar,s;
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        s=(float)(a+b+c)/2;
        Ar=s*(s-a)*(s-b)*(s-c);
        
        System.out.format("%.2f",Math.sqrt(Ar));
        sc.close();
        
    }
}
