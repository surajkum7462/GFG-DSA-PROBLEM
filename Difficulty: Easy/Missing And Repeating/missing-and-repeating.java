class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int repeating = -1, missing = -1;

        // Step 1: Use a frequency array to count occurrences
        int[] freq = new int[n + 1]; // For numbers from 1 to n

        for (int num : arr) {
            freq[num]++;
        }

        // Step 2: Identify the repeating and missing numbers
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                repeating = i; // Found the repeating number
            } else if (freq[i] == 0) {
                missing = i;   // Found the missing number
            }
        }

        // Step 3: Return the results
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);
        return ans;
    }
}
