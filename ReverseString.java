/**
 * Write a function that takes a string as input and returns the string reversed.
 */
public class ReverseString
{
    public String reverseString(String s)
    {
        char[] array = s.toCharArray();
        int start = 0;
        int end = array.length-1;
        while (start < end)
        {
            char temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            start++;
            end--;
        }
        return new String(array);
    }
}
