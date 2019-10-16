//genric if we use numreic value then it gave erron

package example;
import java.util.*;

public class genric {
    void fun1()
    {
        List <String>ls=new ArrayList<String>();
        ls.add("coke");
        ls.add("pepsi");
        ls.add("coke");

        ls.add("fruti");

        System.out.println(ls);
        System.out.println("no of items:"+ls.size());


    }
    public static void main(String args[]){
        genric a=new genric();
        a.fun1();
    }
}
