//1929. Concatenation of Array
class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
          ans[i] = nums[i];
          ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}

//1920. Build Array from Permutation
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

//2235. Add Two Integers
class Solution {
    public int sum(int num1, int num2) {
        return num1+num2;
    }
}

//1480. Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum[i] = sum[i-1] + nums[i];
        }
        return sum;
    }
}
//1108. Defanging an IP Address
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}

//2011. Final Value of Variable After Performing Operations
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i<operations.length; i++){
            if(operations[i].equals("X--") || operations[i].equals("--X")){
                x--;
            }
            else{
                x++;
            }
        }
        return x;
    }
}



