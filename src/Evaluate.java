import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

// 已完成！
public class Evaluate {
    public static void main(String[] args) {

        Stack<String> opts= new Stack<String>();
        Stack<Double> vals= new Stack<Double>();
        while (!StdIn.isEmpty())
        {  //判断如果是运算符则压入运算符栈中
            String s=StdIn.readString();
            if(s.equals("("))   ;
            else if (s.equals("+")) opts.push(s);
            else if (s.equals("-")) opts.push(s);
            else if (s.equals("*")) opts.push(s);
            else if (s.equals("/")) opts.push(s);
            else if (s.equals("sqrt")) opts.push(s);
            //遇到右括号弹出运算符，进行运算后压入操作数栈
            else if (s.equals(")"))
            {
                var op=opts.pop();
                var v=vals.pop();
                if (op.equals("+")) vals.push(vals.pop()+v);
                else if (op.equals("-"))  vals.push(vals.pop()-v);
                else if (op.equals("*"))  vals.push(vals.pop()*v);
                else if (op.equals("/"))  vals.push(vals.pop()/v);
                else if (op.equals("sqrt")) vals.push(v*v);
            }
            //如果既不是右括号与运算符，则视为Double
            else vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }
}