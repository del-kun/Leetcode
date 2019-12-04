import java.util.ArrayList;

class Solution7 {
    public int reverse(int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int temp = x;
        boolean zero = true;
        while(temp != 0){
            if(temp%10 != 0)
                zero = false;
            if(!zero)
                ans.add(temp%10);
            temp/=10;
        }
        long num = 0;
        int count = 1;
        for(int i = 0; i < ans.size(); i++)
        {
            num*=10;
            num+=ans.get(i);
        }
        if(-2147483648L>num || num>2147483647L)
            return 0;
        return (int)num;

    }
}