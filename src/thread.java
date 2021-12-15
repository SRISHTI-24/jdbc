public class thread implements Runnable{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++) {
                Thread.sleep(5000);
                System.out.println(i);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class main
{
    public static void main(String[] args) {
        thread t = new thread();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
