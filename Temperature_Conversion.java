import java.util.Scanner;
public class temp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        double f=(double)32+(c*1.8);
        System.out.format("%.2f",f);
    }
}