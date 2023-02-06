import java.nio.file.attribute.FileStoreAttributeView;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        int[] ar = {3,2,4,1,5};
        bubbleDsc(ar);
        for(int j = 0; j<ar.length; j++){
            System.out.print(ar[j]);
        }
    }

    public static int[] bubbleAsc(int[] nums){
        int num1;
        int num2;
        for(int i = 0; i<nums.length-1; i++){
            num1 = nums[i];
            num2 = nums[i+1];
            if(nums[i]>nums[i+1]){
                nums[i+1]=num1;
                nums[i]=num2;
            }
        }
        return nums;
    }

    public static int[] bubbleDsc(int[] nums){
        int num1;
        int num2;
        for(int i = 0; i<nums.length-1; i++){
            num1 = nums[i];
            num2 = nums[i+1];
            if(nums[i]<nums[i+1]){
                nums[i+1]=num1;
                nums[i]=num2;
            }
        }
        return nums;
    }

    public static int[] insAsc(int[] nums){
        int num1;
        int num2;
        for(int i = 0; i<nums.length-1; i++){
            num1 = nums[i];
            num2 = nums[i+1];
            if(nums[i]>nums[i+1]){
                nums[i+1]=num1;
                nums[i]=num2;
            }
        }
        return nums;
    }

    public static boolean binarySearch(int[] ary, int val){
        int min = 0, max = ary.length -1 ;
        int index = max/2;     
        while(min < max){
            index = (max + min)/2;
            if(ary[index] == val){
                System.out.println("Found at: "+index);
                return true;
            }
            if(ary[index] > val){
                max = index - 1;
            }
            if(ary[index] < val){
                min = index + 1;
            }   
        }
        return false;
    }
}