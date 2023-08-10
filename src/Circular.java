public class Circular
{
    public static void main(String[] args)
    {
        String s1="abcde";
        System.out.println(mystery(s1));

    }
    public static boolean isCircular(String a,String b)
    {
        return ((a.length()==b.length())&&(a+a).indexOf(b)!=-1);
    }
    public  static String mystery(String s)
    {
        int N=s.length();
        if (N<=1) return s;
        String a=s.substring(0,N/2);
        String b=s.substring(N/2,N);
        return  mystery(b)+mystery(a);
    }

}
