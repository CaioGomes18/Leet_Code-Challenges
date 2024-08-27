package c_TwoSum;

public class Main {
	public static void main(String [] args) {
		
		int [] nums = {2, 7, 11, 15};
		nums = Solution.twoSum(nums, 9);
		for(int i : nums) 
		{
			System.out.print("[" + i + "]");
		}
		
		System.out.println("\n");
		
		int [] numeros = {3, 2, 4};
		numeros = Solution.twoSum(numeros, 6);
		for(int j : numeros) 
		{
			System.out.print("[" + j + "]");
		}
		
		System.out.println("\n");
		
		int [] nums2 = {3, 3};
		nums2 = Solution.twoSum(nums2, 6);
		for(int x : nums2) 
		{
			System.out.print("[" + x + "]");
		}
	}
}
