public class example
{
    public static void main(int a,int b)
    {
        int c;
        int sum;
        sum= a+b;
        c=a;
        a=b;
        b=c;
        System.out.println("Sum ="+ sum);
        System.out.println("A ="+ a);
        System.out.println("B ="+ b);
    }
}
