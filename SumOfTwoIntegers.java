/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 */
public class SumOfTwoIntegers
{

    public static int getSum(int a, int b)
    {
        if(b == 0)//没有进位的时候完成运算
        {
            return a;
        }
        int sum,carry;
        sum = a^b;//求和
        carry = (a&b)<<1;//移位
        return getSum(sum,carry);//sum+carry的递归
    }

}
