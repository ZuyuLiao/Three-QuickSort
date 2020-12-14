import java.util.*;

class QuickSortFirstPivot {
    public static void quicksort(int[] nums, int low, int high){
        if(low < high){
            int pivot = partition(nums, low, high);
            quicksort(nums, low, pivot-1);
            quicksort(nums, pivot+1, high);
        }
    }

    public static int partition(int[] nums, int low, int high){
        int pivot = low-1;
        for(int j = low; j < high;j++){
            if(nums[j] < nums[high]){
                pivot++;
                int temp = nums[pivot];
                nums[pivot] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[pivot+1];
        nums[pivot+1] = nums[high];
        nums[high] = temp;
        return pivot+1;
    }

    public static void main(String[] args) {
        QuickSortFirstPivot s = new QuickSortFirstPivot();
        int[] nums = new int[]{3,1,2,8,5,12,4};
        int high = nums.length;
        s.quicksort(nums, 0, high-1);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
