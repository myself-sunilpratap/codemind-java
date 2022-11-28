import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        double l,m,n;
        Scanner sc=new Scanner(System.in);
        l=sc.nextDouble();
        m=sc.nextDouble();
        n=(l+m)/2;
        System.out.format("%.4f",n);
    }
}