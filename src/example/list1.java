package example;
import java.util.*;

public class list1 {
    void fun1()
    {
        List ls=new ArrayList();
        ls.add("coke");
        ls.add("pepsi");
        ls.add("coke");
        ls.add(500);
        ls.add(50.12);
        ls.add("fruti");

        System.out.println(ls);
        System.out.println("no of items:"+ls.size());

        System.out.println("\n\n----------------------------\n\n");
        System.out.println(ls.get(1));
        ls.set(1,"limca");
        ls.add(2,"limca");
        ls.remove("fruti");
        //ls.clear();

        System.out.println(ls);
        System.out.println("no of items:"+ls.size());

    }
    public static void main(String args[]){
        list1 a=new list1();
        a.fun1();
    }
}
