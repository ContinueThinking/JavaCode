public class io
{
    public  static  void  main(String args[])
    {
        var x=Integer.parseInt(args[0]);
        var y=Integer.parseInt(args[1]);
        var z=Integer.parseInt(args[2]);
        if(x==y&&x==z)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
    }
}
