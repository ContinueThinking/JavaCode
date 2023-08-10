public class Histogram
{
    public static void main(String[] args)
    {
        int [] a= new int [5];
        for (int i=0;i<5;i++)
        {
            a[i]=10;
        }
        var b=histogram(a,5);
        System.out.println();


    }





    public  static int[] histogram(int a[],int N)
    {
        int[] b = new int[N];
        var flag=true;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]<=N&&a[i]>=0)
                b[a[i]]++;
            else
                flag=false;
        }
        //判断是否合法
        if (flag==true)
        {
            var sum=0;
            for (int i=0;i<N; i++)
                sum+=b[i];
            if (a.length==sum)
                System.out.println("合法！");
            else
                System.out.println("有错误！");
        }
        return b;
    }
}
