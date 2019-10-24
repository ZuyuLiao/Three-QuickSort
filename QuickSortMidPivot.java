import java.util.*;

class QuickSortMidPivot {
    
    public void quicksort(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int mid = left + (right - left)/2;
        while(i <= j){
            while(arr[i] < arr[mid]) i++;
            while(arr[j] > arr[mid]) j--;
            if(arr[i] >= arr[mid] && arr[j] <= arr[mid]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (left < i - 1)
            quicksort(arr, left, i - 1);
        if (i < right)
            quicksort(arr, i, right);
    }

    public static void main(String[] args) {
        QuickSortMidPivot s = new QuickSortMidPivot();
        int[] nums = new int[]{3,1,2,1,5,12,4};
        int high = nums.length;
        s.quicksort(nums, 0, high-1);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}