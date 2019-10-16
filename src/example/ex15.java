package example;
import java.util.*;
public class ex15 {
    void fun()
    {
        Set st=new HashSet();
        st.add("coke");
        st.add("scale");
        st.add("chips");
        st.add("coke");
        st.add(500) ;
        System.out.println(st);
        System.out.println("no of items:"+st.size());
    }
    public static void main(String args[]){
        ex15 ac=new ex15();
        ac.fun();
    }
}
