class Solution6 {
    public String convert(String s, int numRows) {
        StringBuilder[] ans = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            ans[i] = new StringBuilder();
        int pos = 0;
        boolean arc = true;
        for (int i = 0; i < s.length(); i++){
            if(pos <= 0){
                arc = true;
                pos = 0;
            }
            if(pos >= numRows-1){
                arc = false;
                pos = numRows-1;
            }
            if (arc)
            {
                ans[pos].append(s.charAt(i));
                pos++;
            }
            else {
                ans[pos].append(s.charAt(i));
                pos--;
            }
        }
        String str = new String();
        for (int i = 0; i < numRows; i++)
            str+=ans[i];
        return str;
    }
}