class Solution {
    public void reverseString(char[] s) {
        int left = 0; // Pointer at the beginning of the array
        int right = s.length - 1; // Pointer at the end of the array

        // Loop until the pointers cross or meet in the middle
        while (left < right) {
            // Swap the characters at the left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move the pointers towards the middle
            left++;
            right--;
        }
    }
}