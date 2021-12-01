class a
{
public static void main(String arr[])
{
try
{
int a=Integer.parseInt(arr[0]);
if(a<0|| a>10)
throw(new Exception("valid range is 0 to 10"));
{
int s=a*a;
System.out.println("Square is:"+s);
}
}catch(Exception ex)
{
System.out.println(ex);
}
}
}
