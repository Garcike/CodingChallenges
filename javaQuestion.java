public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
		int[] arr2 = {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};
		int[] arr3 = {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};
		
		//returns 11
		System.out.println(largestGap(arr1));
		
		//returns 4
		System.out.println(largestGap(arr2));
		
		//returns 2
		System.out.println(largestGap(arr3));
		
	}//end main
	
	public static int largestGap(int[] nums) {
		
		int[] sortedArray = selectionSort(nums);
		
		int largestGap = 0, gap;
		
		for(int i = 0; i < sortedArray.length - 1; i++) {
			
			gap = sortedArray[i + 1] - sortedArray[i];
			
			if(gap > largestGap) {
				largestGap = gap;
			}//end if
			
		}//end for
		
		return largestGap;
		
	}//end largestGap
	
	public static int[] selectionSort(int[] nums) {
		
		int position;
		int temp;
		
		for(int i =0; i < nums.length; i++) {
			
			position = i;
			for(int j = i + 1; j < nums.length; j++) {
				
				if(nums[j] < nums[position]) {
					position = j;
				}//end if
				
			}//end for
			
			temp = nums[position];
			nums[position] = nums[i];
			nums[i] = temp;
			
		}//end for
		
		return nums;
		
	}//end 

}//end main