package hand.com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int sum=0;
        for (int i = 100; i < 200;i++) {

            if (IsRightNum(i))
            {
                System.out.print(i+"  ");
                sum++;
                if (sum%10==0)
                {
                    System.out.println();
                }

            }

        }

        System.out.println("素数的个数："+sum);
    }

    private static boolean IsRightNum(int i) {

        for (int j = 2; j < Math.sqrt(i);j++) {

            if (i%j==0)
            {
                return false;
            }

        }
        return true;
    }
}
