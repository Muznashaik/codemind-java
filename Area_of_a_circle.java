import java.util.Scanner;
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double a=(float)3.14*r*r;
        System.out.format("%.2f",a);
    }
}