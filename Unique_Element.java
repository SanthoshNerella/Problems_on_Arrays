public class Unique_Element {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6,7,2,6,7};
        int unique = 0;
        for(int num : arr){
            unique ^= num;
        }
        System.out.println("Unique Elemnt in Array is: " + unique);
    }
    
}
