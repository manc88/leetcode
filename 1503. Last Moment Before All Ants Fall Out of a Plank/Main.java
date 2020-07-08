import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        new Solution().getLastMoment(5, new int[] { 0, 1 }, new int[] { 3, 4 });

    }

}

class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {

        int[][] plank = new int[n][2];
        int total_ants = left.length + right.length;

        for (int i = 0; i < left.length; i++) {
            plank[left[i]][0] = -1;
        }

        for (int i = 0; i < right.length; i++) {
            plank[right[i]][0] = 1;
        }

        System.out.println(Arrays.deepToString(plank));

        int t = 0;
        do {

            t++;

            // lets go
            int prev_ant = 0;
            for (int i = 0; i < plank.length; i++) {

                // 1. if the ant at the left edge of plank and watch left, drop him
                // 2. if the ant at the right edge of plank and watch right, drop him
                // 3. else make a move

                // 4. When two ants moving in two different directions meet at some point,
                // they
                // change their directions and continue moving again

            }

        } while (total_ants > 0);

        return t;
    }

}