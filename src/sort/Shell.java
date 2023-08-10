package sort;

import edu.princeton.cs.algs4.StdOut;

public class Shell {
    public static void sort(Comparable[] a) {
        int N=a.length;
        int h=1;
        while (h<N/3){h=3*h+1;}
        while (h>=1)
        {
            for (int i = h; i < N; i++) {
                for (int j=i; j>=h&&less(a[j],a[j-h]);j-=h)
                {exch(a,j,j-h);}
            }
            h/=3;
        }
    }
    private static boolean less(Comparable v, Comparable w) {return v.compareTo(w) < 0;}
    private static void exch(Comparable[] a,int i,int j){
        Comparable t=a[j];
        a[j]=a[i];
        a[i]=t;
    }
    private static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i]+" ");
        }
        StdOut.println();
    }
    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            if (less(a[i],a[i-1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] a={9,8,7,6,5,4,3,2,1,0};
        show(a);
        var x =isSorted(a);
        if (x==true){StdOut.println("true");}
        sort(a);
        x =isSorted(a);
        if (x==true){StdOut.println("true");}
        show(a);
    }
}
