class Solution {
    public int getLeastFrequentDigit(int n) {
        String nums = String.valueOf(n);

        int res = nums.charAt(0) - '0';
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length(); i++)
        {
            int count = 0;

            for(int j = 0; j < nums.length(); j++)
            {
                if(nums.charAt(i) == nums.charAt(j))
                {
                    count++;
                }
            }

            if(ans > count)
            {
                ans = count;
                res = nums.charAt(i) - '0';
            }

            if(count == ans && nums.charAt(i) - '0' < res)
            {
                res = nums.charAt(i) - '0';
            }
        }
        return res;
        
    }
}