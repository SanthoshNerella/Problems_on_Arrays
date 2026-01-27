public class SecondLargest {
    public static void main(String[] args) {
        int first_Largest_Num = Integer.MIN_VALUE;
        int second_Largest_Num = Integer.MIN_VALUE;
        int[] nums = {23,34,56,67,21,39,60,41};
        for(int num : nums){
            if(first_Largest_Num < num){
                second_Largest_Num = first_Largest_Num;
                first_Largest_Num = num;
            }else if(second_Largest_Num < num && num < first_Largest_Num){
                second_Largest_Num = num;
            }
        }
        System.out.println("SecondLargest num is: " + second_Largest_Num);
    }
    
}
