public class Unique_Elemnts_sortedARray {

   static int unique_Elments(int [] arr){
        int k  = 0;
        for(int j = 1 ;j < arr.length ; j++){
            if(arr[j] != arr[k]){
                k++;
                arr[k] = arr[j];
            }
        }
        return k + 1;      // count ie. nof of unique_elemnts in an Array
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,6,6,7,7,9,9};
       int count = unique_Elments(arr);
       System.out.println("No of unique elents in array is: " + count);
       System.out.println("Array after fiindig Unique Elemts: ");
       for(int i = 0 ; i < count ; i++){
        System.out.print(arr[i] + " ");
       }
    }
    
}
