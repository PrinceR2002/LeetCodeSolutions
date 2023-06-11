import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
//136. Single Number

    /*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

    You must implement a solution with a linear runtime complexity and use only constant extra space.



    Example 1:

    Input: nums = [2,2,1]
    Output: 1
    Example 2:

    Input: nums = [4,1,2,1,2]
    Output: 4
    Example 3:

    Input: nums = [1]
    Output: 1*/
    public static void main(String[] args) {

        //Test Cases

        singleNumber( new int[] {2,2,1});
        singleNumber( new int[] {4,1,2,1,2});
        singleNumber( new int[] {1});

    }
    public static int singleNumber(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(!result.contains(nums[i])){
                result.add(nums[i]);
            }
            else{
                result.remove(new Integer(nums[i]));
            }
        }
        System.out.println(result.get(0));
        return result.get(0);

    }
}
