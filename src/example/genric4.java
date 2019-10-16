//

package example;
import java.util.*;
import java.lang.*;

public class genric4 {
    void fun1()
    {
        List <Integer>ls=new ArrayList<Integer>();
        ls.add(23);
        ls.add(45);
        ls.add(65);



        System.out.println(ls);
        System.out.println("no of items:"+ls.size());
        Collections.sort(ls,Collections.reverseOrder());
        System.out.println(ls);


    }
    public static void main(String args[]){
        genric4 a=new genric4();
        a.fun1();
    }
}
