import java.util.Scanner;
interface AdvancedArithematic
{
    public abstract int divi_sum(int n);
}
class Mycalculator implements AdvancedArithematic
{
    public int divi_sum(int n)
    {
        int s=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        return s;
    }
}
public class test {
    public static void main(String[] args) {
        Mycalculator m = new Mycalculator();
        Scanner s = new Scanner(System.in);
        System.out.println(m.divi_sum(s.nextInt()));
    }
}
