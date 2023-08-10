import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class DoubleThreadSearch {
    public static void co_have(int[] a, int[] b)
    {
        int x=0;
        int y=0;
        while (x<a.length&&y<b.length)
        {
            if (a[x]<b[y]){x++;}
            else if (a[x]>b[y]){y++;}
            else {
                StdOut.println(a[x]);
                x++;
                y++;
            }
        }

    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a= in.readAllInts();
        in =new In(args[1]);
        int[] b= in.readAllInts();
        co_have(a,b);
    }

    public static class UF {
    }
}
