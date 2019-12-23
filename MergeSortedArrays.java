
public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] nums1 = new int[]{1,2,4,5,6,0};
		// int[] nums2 = new int[]{3};
		int[] nums1 = new int[]{4,0,0,0,0,0};
		int[] nums2 = new int[]{1,2,3,6,5};
		// int[] nums1 = new int[]{1,2,3,0,0,0};
		// int[] nums2 = new int[]{2,5,6};
		int m = 6, n = 5;
		int[] nums = merge(nums1, m, nums2, n);
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i]);
	}
	static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0, j = 0, k = 0;
		for (i = 0, j=0; i < nums1.length && j < nums2.length ; i++){
		   if( nums1[i] == 0) {
		       nums1[i] = nums2[j];
		       j++;
		   }
		}
		for(i = 0; i < nums1.length; i++){
            for(k = nums1.length - nums2.length;k < nums1.length ; k++){
			    if(nums1[i] > nums1[k] && k > i) {     
			        int temp = nums1[i];
			        nums1[i] = nums1[k];
			        nums1[k] = temp;            
			    } else if (k < i && nums1[i] < nums1[k])  {
			    	int temp = nums1[k];
			    	nums1[k] = nums1[i];
			    	nums1[i] = temp;
			    }
            }
		}
		return nums1;
	}
}
