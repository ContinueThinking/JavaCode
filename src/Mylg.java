public class mytry {
    public static void main(String args[])
    {
        System.out.println(lg(2));
    }
    public static int lg(int N)
    {
        var MaxInt=-1;
        for(int i=1;i<=N;i*=2)
            MaxInt++;

        return MaxInt;
    }


}
