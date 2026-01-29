public class SecondSmallest {
                                          ///// SecondSmallest Elemnt in an Array
    public static void main(String[] args) {
        int first_Small_Num = Integer.MAX_VALUE;
        int secnd_Small_Num = Integer.MAX_VALUE;
        int[] nums = {3,2,8,5,9,2,1};
        for(int num : nums){
            if(first_Small_Num > num){
                secnd_Small_Num = first_Small_Num;
                first_Small_Num = num;
            }else if(secnd_Small_Num > num && first_Small_Num < num){
                secnd_Small_Num = num;
            }
        }
        System.out.println("the Second Smmalest Elemnt is: " + secnd_Small_Num);
    }  
}
