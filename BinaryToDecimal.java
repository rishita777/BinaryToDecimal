package Binary;

import java.util.Scanner;

public class BinaryToDecimal
{
    public static int getDecimal(int binary)  //111
    {
        int decimal = 0;
        int n = 0;
        while(binary>0)
        {

                int temp = binary%10;
                decimal += temp* Math.pow(2, n);       // decimal = 0+0*2^0          = 1*2^2
                binary = binary/10;            //  10
                n++;

        }
        return decimal;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int z=getDecimal(n);
        System.out.println("Decimal "+z);
    }
}
