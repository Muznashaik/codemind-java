import java.util.Scanner;
class T
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        double f=(float)(1.8*c)+32;
        System.out.format("%.2f",f);
    }
}