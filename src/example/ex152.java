package example;
import java.util.*;
public class ex152 {
    void fun() {
        Set st = new HashSet();
        /*
        st.add("coke");
        st.add("scale");
        st.add("chips");
        st.add("coke");
        st.add(500);
*/
        if (st.isEmpty()) {
            System.out.println("trolly empty");
        } else {
            System.out.println(st);
            System.out.println("no of items:" + st.size());
        }
    }
    public static void main(String args[]){
        ex152 ac=new ex152();
        ac.fun();
    }
}
