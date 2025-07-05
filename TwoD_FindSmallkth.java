import java.util.*;
class Solution1
{
    public int findSmallKth(int[][] matrix, int k) 
    {
        // Implement the logic to find the k-th smallest element in a sorted 2D matrix
        // The matrix is sorted in ascending order both row-wise and column-wise
        // Return the k-th smallest element

        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) 
            {
                if(p.size() < k) {
                    p.add(matrix[i][j]);
                } else if(matrix[i][j] < p.peek())
                {
                    p.poll();
                    p.add(matrix[i][j]);
                }
            }
        }
        return p.peek(); // Placeholder return value
    }
}
 class TwoD_FindSmallkth
 {
    public static void main(String[] args)
     {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8; // Find the 8th smallest element
        Solution1 s = new Solution1();
        System.out.println(s.findSmallKth(matrix, k));
    }

}