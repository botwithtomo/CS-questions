// 169 Majority Element
// Easy
/*
Given an array of size n, find the majority element. 
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

// This method takes 3 ms.
// This one is easy to understand, you just sort them, and the mojority element must be at the middle.

public int majorityElement(int[] nums) {
	int mid = (nums.length)/2;
	Array.sort(nums);
	return nums[mid];
}

// This method takes 2ms.
// this method just takes advantages of the majority is always at elast one more than the rest.
// if count =0 means we don't have any backup result yet so we pick this element as result;
// if it appear other element, we let count--, the majority will always have positive count.
public int majorityElement(int[] nums){
	int count =0, rst = 0;
	for(int i =1; i<nums.length;i++){
		if(count ==0){
			rst = nums[i];
			count++;
		}else if(rst == nums[i]){
			count++;
		} else {
			count--;
		}
	}
	return rst;
		
}