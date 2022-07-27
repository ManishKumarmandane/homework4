package oddeven;

public class OddEvenumber
{
    public static void main(String[] args)
    {
        int i ;
        for(i=1; i<=20;i++)
        {
            if (i % 2 == 0)
            {
                //System.out.println("print even number");
                System.out.print(+ i + "= Is Even"  );
            }
            else
            {
                System.out.print("\n" + i + " Is Odd   "   );
            }
        }

    }
}
