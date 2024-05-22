package EX1;

public class EX1_ContainsDuplicate {
	public static void main(String[] args) {
		//int [] nums = {1,2,3,3};
		//int [] nums = {1,2,3,4};
		int [] nums = {1,1,1,3,3,4,3,2,4,2};
		
		
		boolean n = Solution.hasDuplicate(nums);
		System.out.println(n);
	}
}
