// 189 Rotate Array
// Easy
/*

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
*/


// We first reverse the first part and then reverse the second part, and then do the total reverse
public void rotate(int[] arr, int order) {
	if(order > arr.length){
		order = order %arr.length;
	}
	 
	//length of first part
	int a = arr.length - order; 
	 
	reverse(arr, 0, a-1);
	reverse(arr, a, arr.length-1);
	reverse(arr, 0, arr.length-1);
}
   
public void reverse(int[] arr, int left, int right){
	if(arr == null || arr.length == 1) return;
	 
	while(left < right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
	}













	