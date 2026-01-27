import java.util.Arrays;
public class SmallestNumber {
    public static void main(String[] args) {
                      // Optimal Approach
        int min_num = Integer.MAX_VALUE;
        int [] nums = {15,6,3,7,8,1};
        for(int num : nums){
            if( min_num > num){
                min_num = num;
            }
        }
        System.out.println("the Smallest Value is: " + min_num);

              /// Brute Force Approach
    Arrays.sort(nums);
    System.out.println("the Smallest Val is: " + nums[0]);  
    }  

}
