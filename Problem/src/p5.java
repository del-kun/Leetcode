class Solution5 {
    public String longestPalindrome(String s) {
        if(s.length() == 0)
            return "";
        int max = 1;
        int max_begin = 0;
        int max_end = 0;
        for(int i = 0; i < s.length(); i++){
            int begin = i;
            int end = begin;
            if ((begin+1)<s.length() && s.charAt(begin) == s.charAt(begin+1))
            {
                end++;
                while(begin>0 && end+1<s.length() && s.charAt(begin-1) == s.charAt(end+1)){
                    end++;
                    begin--;
                }
//                max = Math.max(end+1-begin,max);
                if(end+1-begin>max){
                    max = end+1-begin;
                    max_begin = begin;
                    max_end = end;
                }
            }
            begin = i;
            end = begin;
            if(begin-1> 0 && s.charAt(begin) == s.charAt(begin-1)){
                end = begin;
                begin--;
                while(begin>0 && end+1<s.length() && s.charAt(begin-1) == s.charAt(end+1)){
                    end++;
                    begin--;
                }
                if(end+1-begin>max){
                    max = end+1-begin;
                    max_begin = begin;
                    max_end = end;
                }
            }
            begin = i;
            end = begin;
            while(begin>0 && end+1<s.length() && s.charAt(begin-1) == s.charAt(end+1)){
                end++;
                begin--;
            }
            if(end+1-begin>max){
                max = end+1-begin;
                max_begin = begin;
                max_end = end;
            }
        }
        return s.substring(max_begin,max_end+1);
    }
}