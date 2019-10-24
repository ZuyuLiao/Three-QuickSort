import java.util.*;

class QuickSortLastPivot {
    public void quicksort(int[] nums, int low, int high){
        if(low < high){
            int pivot = partition(nums, low, high);
            quicksort(nums, low, pivot-1);
            quicksort(nums, pivot+1, high);
        }
    }

    public int partition(int[] nums, int low, int high){
        int pivot = low;
        for(int j = low;j<nums.length-1;j++){
            if(nums[j] < nums[high]){
                int temp = nums[pivot];
                nums[pivot] = nums[j];
                nums[j] = temp;
                pivot++;
            }
        }
        int temp1 = nums[high];
        nums[high] = nums[pivot];
        nums[pivot] = temp1;
        return pivot;
    }

    public static void main(String[] args) {
        QuickSortLastPivot s = new QuickSortLastPivot();
        int[] nums = new int[]{3,1,1,1,5,12,4};
        int high = nums.length;
        s.quicksort(nums, 0, high-1);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}