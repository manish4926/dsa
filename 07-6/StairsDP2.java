import java.util.*;

public class stairsDP2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int moves[] = new int[n];
        for (int i = 0; i < moves.length; i++) {
            moves[i] = scn.nextInt();
        }

        int dp[] = new int[n + 1];

        for (int i = n; i >= 0; i--) {
            if (i == n) {
                dp[i] = 1;
            } else {
                int maxjumps = moves[i];
                for (int len = 1; len <= maxjumps && len + i <= n; len++) {
                    dp[i] += dp[i + len];
                }
            }
        }

        //return dp[0];
        System.out.println(dp[0]);
    }


}
