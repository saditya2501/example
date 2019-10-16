//single threading using therad class

package example;

public class example extends Thread {
   public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            try
            {
                sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String []a)
    {
        example abj=new example();
        abj.start();
    }
}
