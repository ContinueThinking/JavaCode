package sort;

import edu.princeton.cs.algs4.StdOut;

public class Insertion {
    public static void sort(Comparable[] a) {
        int N= a.length;
        for (int i = 1; i < N; i++) {
            for (int j=i;j>0&&less(a[j],a[j-1]);j--)
                {exch(a,j,j-1);}
        }
    }
    private static boolean less(Comparable v, Comparable w) {return v.compareTo(w)<0;}
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
    //测试一下
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
