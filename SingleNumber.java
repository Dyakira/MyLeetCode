/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * tip:xor 1,1->0 0,0->0
 */
public class SingleNumber
{
    public int singleNumber(int[] nums)
    {
        if(nums.length == 1)
        {
            return nums[0];
        }
        for(int i = 1; i< nums.length; i++)
        {
            nums[0]^=nums[i];
        }
        return nums[0];
    }
}
