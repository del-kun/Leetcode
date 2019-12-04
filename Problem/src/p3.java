class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int sign[] = new int[256];
        int count = 0;
        int max = 0;
        for ( int i = 0; i < s.length(); i++){
            if(sign[s.charAt(i)] == 0){
                sign[s.charAt(i)] = i+1;
                count++;
            }
            else {
                i = sign[s.charAt(i)]-1;
                if(count>max) {
                    max = count;
                }
                count = 0;
                sign = new int[256];
            }
        }
        if(count > max){
            max = count;
        }
        return max;
    }
}