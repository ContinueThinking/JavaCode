package sort;
/*自底向上归并*/
public class MergeBU {
    private static Comparable aux[];


    public static void sort(Comparable[] a)
    {//自底向上开始排序
        int N=a.length;
        //初始化辅助数组
        aux=new Comparable[a.length];
        //归并
        for (int sz=1;sz<N;sz=sz+sz)
        {
            for (int lo=0;lo<N-sz;lo+=sz+sz)
                merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1 ));
        }

    }



    public static void merge(Comparable[] a,int lo,int mid,int hi)
    {
        int i=lo,j=mid+1;
        //复制数组
        for (int k = 0; k < a.length; k++) {
            aux[k]=a[k];
        }
        //开始归并
        for (int k = 0; k < a.length; k++) {
            if(i>mid)                   {a[k]=aux[j++];}
            else if(j>hi)               {a[k]=aux[i++];}
            else if(less(aux[j],aux[i]))  {a[k]=aux[j++];}
            else                             {a[k]=aux[j++];}

        }

    }
    private static boolean less(Comparable v, Comparable w) {return v.compareTo(w) < 0;}


}
