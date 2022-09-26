import java.util.Scanner;
class A
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        double avg=(float)(a+b)/2;
        System.out.format("%.4f",avg);
    }
}