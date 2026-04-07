class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.trim();
        newString = newString.toLowerCase();
        char[] stringChar = newString.toCharArray();
        ArrayList<Character> tempArray = new ArrayList<>();

        for (int i = 0; i < stringChar.length; i++) {
            if (Character.isLetterOrDigit(stringChar[i])) {
                tempArray.add(stringChar[i]);
            }
        }

        int left = 0;
        int right = tempArray.size() - 1;
        while(left <= right) {
            if (tempArray.get(left) != tempArray.get(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}
