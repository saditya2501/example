package example;
import java.util.*;
public class ex153 {
    void fun() {
        Set st = new HashSet();

        st.add("coke");
        st.add("scale");
        st.add("chips");
        st.add("coke");
        st.add(500);
/*
        if (st.isEmpty()) {
            System.out.println("trolly empty");
        } else {
            System.out.println(st);
            System.out.println("no of items:" + st.size());
        }*/
if(st.contains("coke"))
{
    System.out.println("found");
    System.out.println(st);
    System.out.println("no of items:"+st.size());
}
else{
    System.out.println("not found");
}
    }
    public static void main(String args[]){
        ex153 ac=new ex153();
        ac.fun();
    }
}
