import java.util.Scanner;
class gra
{
    public static void main(String args[])
    {
        int h,s,t;
        Scanner x=new Scanner(System.in);
        h=x.nextInt();
        s=x.nextInt();
        t=x.nextInt();
        if(h>50&&s>60&&t>100)
        System.out.println("10");
        else if(h>50&&s>60)
        System.out.println("9");
        else if(s>60&&t>100)
        System.out.println("8");
        else if(h>50&&t>100)
        System.out.println("7");
        else if(h>50||s>60||t>100)
        System.out.println("6");
        else
        System.out.println("5");
        
    }
}