package sort;

import edu.princeton.cs.algs4.StdOut;

/*自顶向下归并*/
public class QuickMerge {
    private static Comparable[] aux;
   public static void sort(Comparable[] a)
    {
        //一次初始化数组
        aux=new Comparable[a.length];
        sort(a,0, a.length-1);
    }
    private static void sort(Comparable[] a,int lo,int hi)
    {
        if(lo>=hi) return;
        int mid=lo+(hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        /*修改为如果a[mid]<a[mid+1] 就不调用merger方法*/
        if (less(a[mid+1],a[mid]))
            merge(a,lo,mid,hi);
    }
    //快速原地归并的方法
    public static void merge(Comparable[] a,int lo,int mid,int hi)
    {
        int N=a.length;
        int i=lo;
        int j=mid+1;
        //复制数组
        for (int k = lo; k <=hi; k++) {
            aux[k]=a[k];
        }
        //开始原地归并
        for (int k = lo; k <=hi; k++) {
            if (i>mid)          { a[k]=aux[j++];}
            else if (j>hi)      { a[k]=aux[i++];}
            else if (less(aux[j],aux[i])) {a[k]=aux[j++];}
            else   {a[k]=a[i++];}
        }
    }


    private static boolean less(Comparable v, Comparable w) {return v.compareTo(w) < 0;}
    private static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i]+" ");
        }
        StdOut.println();
    }
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,7,8,9};
        sort(a);
        show(a);

    }
}
