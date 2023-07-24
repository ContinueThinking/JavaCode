import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.WeakHashMap;
//泛型定容栈
public class FixedCapacityStack<Item>
{
    public static void main(String[] args) {
        FixedCapacityStack s;
        s= new FixedCapacityStack(100);
        while (!StdIn.isEmpty())
        {
            String item= StdIn.readString();
            if(!item.equals("-"))
            {
                s.push(item);
            }
            else if (!item.isEmpty()) StdOut.println(s.pop()+" ");
        }
        StdOut.println("("+s.size()+"left on stack)");
    }
    private String[] a;
    private int local=0;

    public FixedCapacityStack(int cap) {
        a=new String[cap];
    }
    void push(String s)
    {
        a[local]=s;
        local++;
    }
    String pop()
    {
        local--;
        String s=a[local];
        return s;
    }
    boolean isEmpty()
    {
        return (local==0);
    }
    int size()
    {
        return local;
    }

}
