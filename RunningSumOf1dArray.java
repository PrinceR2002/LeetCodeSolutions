public class RunningSumOf1dArray {
    //1480. Running Sum of 1d Array
    /*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

    Return the running sum of nums.



    Example 1:

    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    Example 2:

    Input: nums = [1,1,1,1,1]
    Output: [1,2,3,4,5]
    Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
    Example 3:

    Input: nums = [3,1,2,10,1]
    Output: [3,4,6,16,17]*/
    public static void main(String[] args){

        //Test Cases:
        //runningSum(new int[] {1, 2, 3, 4});
        //runningSum(new int[] {1,1,1,1,1});
        //runningSum(new int[] {3,1,2,10,1});
    }
    public static int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];

        //Since the first number in the array will be the same as the output we can just put it in the result array.
        result[0] = nums[0];

        //Now we can loop through the array setting i as 1, and setting result[i] to nums' previous index + the current one
        for(int i = 1; i < nums.length; i++){
            result[i] = nums[i-1] + nums[i];
        }


        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
        return result;
    }
}
