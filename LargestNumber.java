public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = { 3 , 4, 7, 5 , 9 , 34, 12, 71};
        int max_Num = Integer.MIN_VALUE;
        for(int num : nums){
            if( max_Num < num){
                max_Num = num;
            }
        }
        System.out.println("the LArgest Numbr is : " + max_Num);
    }
    
}
