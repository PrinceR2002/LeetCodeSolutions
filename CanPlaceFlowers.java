public class CanPlaceFlowers {
    //605. Can Place Flowers
    /*You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

    Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.



            Example 1:

    Input: flowerbed = [1,0,0,0,1], n = 1
    Output: true
    Example 2:

    Input: flowerbed = [1,0,0,0,1], n = 2
    Output: false*/
    public static void main(String[] args) {

        //Test Cases:
        canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1);
        canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        //First we want to initialize a count variable
        int count = 0;

        //then we're going to create a for-loop to iterate through the array
        for(int i = 0; i < flowerbed.length; i++){
            //Then we're going to create a nested if statement to go over all
            // the requirements for a flower to be planted

            //Our first requirement is to see if there's an empty plot (0)
            //The make sure it's not adjacent to other flowers
            if(flowerbed[i] == 0){
                //This checks if the current index is on the LEFT edge of the plot
                // OR if the LEFT of the current index is a zero (0),
                // If one of the cases is true, then 'left' is true

                boolean left = (i==0)||(flowerbed[i-1] == 0);
                //This checks if the current index is on the RIGHT edge of the plot
                // OR if the RIGHT of the current index is a zer0 (0)
                //If one of the cases is true, then 'right is true

                boolean right =(i == flowerbed.length-1) || (flowerbed[i+1] == 0);

                //Now we're going to plant those flowers until none of the other plots fit the requirements
                //Anymore. We're doing this so we can keep track of the amount of flowers we plant,
                //so we can compare them to 'n' and see whether not we can plant 'n' amount of flowers.

                //this if statement is triggered if left and right are true, meaning if the the requirements
                //to be planted we're met.
                if(left&&right){
                    //This essentially plants the flower
                    flowerbed[i]=1;
                    //We're using this to count the amount of times we're planting
                    count++;

                    //Now this last step compares the amount of times we were able to plant vs how much
                    //they want us to plant, if we can plant more or equal to 'n' then, It's true, but if
                    // we can't then it's false and tha't because we don't have enough space to plant them.
                    if(count >= n) {
                        System.out.println(true);
                        return true;
                    }
                }
            }
        }

        System.out.println(count >= n);
        return count >= n;

    }
}
