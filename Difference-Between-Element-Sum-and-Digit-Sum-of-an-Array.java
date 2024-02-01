class Solution {
    public int differenceOfSum(int[] nums) {
        int sums = 0;
        int digi = 0;
        for(int i=0; i<nums.length; i++){
            sums = sums + nums[i];
            digi = digi + digisum(nums[i]);
        }

        return Math.abs(sums-digi);
    }

    public static int digisum(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
}
