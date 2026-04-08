class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            int maxvalue = 0;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] > maxvalue) {
                    maxvalue = arr[j];
                }
            }
            res[i] = maxvalue;
        }

        res[arr.length - 1] = -1;

        return res;
    }
}