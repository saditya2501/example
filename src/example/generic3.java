//genric if we use numreic value then it gave erron

package example;
import java.util.*;
import java.lang.*;

public class generic3 {
    void fun1()
    {
        List <Integer>ls=new ArrayList<Integer>();
        ls.add(23);
        ls.add(45);
        ls.add(65);



        System.out.println(ls);
        System.out.println("no of items:"+ls.size());
        Collections.sort(ls);
        System.out.println(ls);


    }
    public static void main(String args[]){
        generic3 a=new generic3();
        a.fun1();
    }
}
