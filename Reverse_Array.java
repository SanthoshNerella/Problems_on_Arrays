public class Reverse_Array {
    public static void main(String[] args) {
        int[] nums = {2,45,64,26,41,67,8,93,53,57,90};
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        System.out.println("Array After Reversing: ");
        for(int num : nums){
            System.out.print(num+ ",");
        }
    }
    
}
