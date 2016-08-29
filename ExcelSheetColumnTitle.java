/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 *  For example:

     1 -> A
     2 -> B
     3 -> C
     ...
     26 -> Z
     27 -> AA
     28 -> AB
 */
public class ExcelSheetColumnTitle
{
    public String convertToTitleRecursive(int n)
    {
        if(n == 0) return "";
        return convertToTitleRecursive(--n / 26)+ (char)('A' + (n % 26));
    }

    public String convertToTitleIteration(int n)
    {
        StringBuilder s = new StringBuilder();
        while(n!=0)
        {
            n--;
            s.append((char) ('A' + (n % 26)));
            n /= 26;
        }
        return s.reverse().toString();
    }
}
