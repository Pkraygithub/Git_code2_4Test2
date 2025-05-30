package lti;

import java.util.Arrays;

public class RotationArray {
	
	public static int[] rotateArry(int[] nums,int k) {
		k=k% nums.length;
		reverse(nums, 0, nums.length-1);

		reverse(nums, 0, k-1);
		reverse(nums, k,nums.length-1);
		return nums;
	}

	public static void main(String[] args) {

		int[] nums= {1,2,3,4,5,6,7};
		int k=3; 
	System.out.println(Arrays.toString(rotateArry(nums, k)));
	
}
		
		public static void reverse(int[] nums,int start,int end) {
			
			while(start<end) {
				int temp=nums[start];
				nums[start]=nums[end];
				nums[end]=temp;
				start++;
				end--;
			}
			
		}
		
		}
	

