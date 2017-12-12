package leetcode;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

public class TwoSum {
	public int[] twoSum(int[] nums, int target)
	{
		Map<Integer, Integer> toSaveMap = new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			if (toSaveMap.containsKey(nums[i]))
			{
				int[] result = {toSaveMap.get(nums[i]).intValue(), i};
				return result;
			}
			else
			{
				toSaveMap.put(target-nums[i], i);
			}
		}
		
		return new int[]{0,0};
	}
	
	public static void main(String[] args) {
		TwoSum example = new TwoSum();
		int[] arrayList = {2,11,15,0,19,20,7};
		int target = 9;
		int[] resultArray = example.twoSum(arrayList, target);
		for (int i:resultArray)
		{
			System.out.println(i);
		}
	}
}
