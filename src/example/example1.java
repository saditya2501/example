//single threading using therad class

package example;

public class example1 extends Thread {
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            try
            {
                sleep(1000);
                 if(i==5)
                 {
                     stop();
                 }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String []a)
    {
        example1 abj=new example1();
        abj.start();
    }
}
