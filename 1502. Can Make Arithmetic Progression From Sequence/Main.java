import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int dx = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != dx) {
                return false;
            }
        }

        return true;

    }

}

class Main {

    public static void main(String[] args) {

        System.out.println(new Solution().canMakeArithmeticProgression(new int[] { 3, 5, 1 }));
        System.out.println(new Solution().canMakeArithmeticProgression(new int[] { 1, 2, 4 }));

    }

}
