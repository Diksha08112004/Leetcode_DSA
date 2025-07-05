import java.util.*;
class Solution
{
    public int Find(int [] nums,int k)
    {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        int start=0;
        int end=nums.length;

        for(int i=0;i<k;i++)
        {
            p.add(nums[i]);
        }

        for(int j=0;j<end;j++)
        {
            if(nums[j]>p.peek())
            {
                p.poll();
                p.add(nums[j]);
            }
        }
        return p.peek();


    }
}
class FindLargestKthElemnet
{
   
    public static void main(String[] args)
    {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2; // Find the 2nd largest element
        Solution s=new Solution();
        System.out.println(s.Find(arr, k));
    }
}