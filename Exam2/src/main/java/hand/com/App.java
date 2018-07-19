package hand.com;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner in = new Scanner(System.in);
        float money=0,tax=0,tex= 0;
        System.out.print("请输入工资：");
        money=in.nextFloat();

        money=money-tex;

        if(money<=3500)
            tax=0;
        else if(money<=5000)
            tax=(money-3500)*0.03f;
        else if(money<=8000)
            tax=(money-5000)*0.1f+(5000-3500)*0.03f;
        else if(money<=12500)
            tax=(money-8000)*0.2f+(8000-5000)*0.1f+(5000-3500)*0.03f;
        else if(money<=38500)
            tax=(money-12500)*0.25f+(12500-8000)*0.2f+(8000-5000)*0.1f+(5000-3500)*0.03f;
        else if(money<=58500)
            tax=(money-38500)*0.3f+(38500-12500)*0.25f+(12500-8000)*0.2f+(8000-5000)*0.1f+(5000-3500)*0.03f;
        else if(money<=83500)
            tax=(money-58500)*0.35f+(58500-38500)*0.3f+(38500-12500)*0.25f+(12500-8000)*0.2f+(8000-5000)*0.1f+(5000-3500)*0.03f;
        else
            tax=(money-83500)*0.45f+(83500-58500)*0.35f+(58500-38500)*0.3f+(38500-12500)*0.25f+(12500-8000)*0.2f+(8000-5000)*0.1f+(5000-3500)*0.03f;
        System.out.println("您应交税："+tax);
    }
}
