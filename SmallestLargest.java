//put your name here
import java.util.Arrays;
public class SmallestLargest{
    public static void main(String[] args){
        int [] nums = new int [10];
        for (int i = 0; i < nums.length; i ++ ){
            nums[i]= (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Smallest: " + smallestValue(nums));
        System.out.println("Largest: " +largestValue(nums));
    }
    public static int smallestValue(int [] nums){
        int smallest = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<smallest){
                smallest = nums[i];
            }
        }
        return smallest;
    }
    public static int largestValue(int [] nums){
        int largest = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}