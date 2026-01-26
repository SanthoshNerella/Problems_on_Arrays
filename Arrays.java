public class Arrays {
    public static void main(String[] args) {
        //---------------------------------------------------------------------------------------------------------------------
         // Type-1 Single Dimentional Array
        int[] nums = new int[5];
        int n = nums.length;
        for(int i = 0 ; i < n ; i ++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;
        nums[4] = 4;
        for( int num : nums)
            System.out.print(num + " ");
        System.out.println();
        boolean result = (nums[1] > nums[2]) ? true : false ;   // ternary operator
        System.out.println("is nums[1] > nums[2] : " + result);

       // ------------------------------------------------------------------------------------------------------------------------------------
                   // Type - 2 : Multidimensional Array

         int[][] arr = new int[3][4];
         for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                arr[i][j] = (int) (Math.random() * 10);
            }
         }
         for(int i = 0 ; i < 3 ;i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
         }
                       /// printing arr values uses another way
        System.out.println();
        for(int a[] : arr){
            for(int k : a){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();
        //-------------------------------------------------------------------------------------------------------------------------------
            // type - 3 jagged Arrays
            
            int [][] evens = new int[3][];
            evens[0] = new int[3];
            evens[1] = new int[4];
            evens[2] = new int[2];
            for(int i = 0 ; i < evens.length ; i++){
                for(int j = 0 ; j < evens[i].length ; j++){
                    evens[i][j] = (int) (Math.random() * 10);
                }
            }
            for(int r[] : evens){
                for(int even : r){
                    System.out.print(even +" ");
                }
                System.out.println();
            }
    }
    
}
