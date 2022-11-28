import java.util.Scanner;
class hand
{
    public static void main(String args[])
    {
        int t,s,b,a;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        a=2*t*s*b*512;
        System.out.println(a);
    }
}