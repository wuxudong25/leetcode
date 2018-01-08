package leetcode;

//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//
//Example 1:
//nums1 = [1, 3]
//nums2 = [2]
//
//The median is 2.0
//Example 2:
//nums1 = [1, 2]
//nums2 = [3, 4]
//
//The median is (2 + 3)/2 = 2.5

public class MedianofTwoSortedArrays
{
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] longArray = nums1.length >= nums2.length ? nums1 : nums2;
    int[] shortArray = nums1.length < nums2.length ? nums1 : nums2;
    int i = (longArray.length + shortArray.length)/2 - shortArray.length;
    int j = shortArray.length - 1;

    
    return (double)j;
  }
  
  public static void main( String[] args )
  {
    MedianofTwoSortedArrays example = new MedianofTwoSortedArrays();
    int[] nums1 = {1,3,5,7,9};
    int[] nums2 = {2,3,4};
    System.out.println( example.findMedianSortedArrays( nums1, nums2 ) );
  }
}
