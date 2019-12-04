import java.util.ArrayList;

class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int left = 0;
        int right = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(left!=len1 || right!=len2){
            if(left == len1){
                while(right != len2)
                    ans.add(nums2[right++]);
            }
            else if(right == len2){
                while(left!=len1){
                    ans.add(nums1[left++]);
                }
            }
            else{
                if(nums1[left]<nums2[right])
                {
                    ans.add(nums1[left++]);
                }
                else
                    ans.add(nums2[right++]);
            }
        }
        int begin = (len1+len2)/2;
        if((len1+len2)%2 == 0)
            return (ans.get(begin-1)+ans.get(begin))/2.0;
        else
            return (double)ans.get(begin);
    }
}