import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Dyakira on 2016/8/24.
 */
public class IntersectionOfTwoArrays
{
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums1).distinct().filter(set::contains).toArray();
    }
}
