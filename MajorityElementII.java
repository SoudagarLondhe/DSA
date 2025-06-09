You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

Note: The answer should be returned in an increasing format.

Examples:

Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times.
Input: arr[] = [1, 2, 3, 4, 5]
Output: []
Explanation: o candidate occur more than n/3 times.
Constraint:
1 <= arr.size() <= 106
-109 <= arr[i] <= 109


Sol 1 :
Recommended using: Boyer-Moore voting algorithm
---------------------------------
Sol 2: 


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int val;
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                val=mp.get(nums[i]);
                val++;
                mp.put(nums[i],val);
            }
            else
            {
                mp.put(nums[i],1);
            }
        }
        int onethirdvalue = nums.length/3;
        
        for(Map.Entry<Integer,Integer> entry: mp.entrySet())
        {
            if(entry.getValue() > onethirdvalue)
            {
                list.add(entry.getKey());
            }
        }
        
        Collections.sort(list);
        return list;
        
        
    }
}



