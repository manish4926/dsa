import java.util.*;

public class stairsDP {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        int n = 4;
        //int ways = climbStairs(n);
        //int ways = climbStairsM(n, new int[n + 1]);
        int ways = climbStairsT(n);
        System.out.println(ways);
    }

    public static int climbStairs(int n) {
        if(n==0) {
            return 1;
        }

        int tways = 0;
        if(n-1 >= 0) {
            tways += climbStairs(n-1);
        }
        if(n-2 >= 0) {
            tways += climbStairs(n-2);
        }
        if(n-3 >= 0) {
            tways += climbStairs(n-3);
        }
        return tways;
    }

    public static int climbStairsM(int n, int[] dp) {   //Memorization
        if(n==0) {
            return dp[n] = 1;
        }

        if(dp[n] !=0) {
            return dp[n];
        }

        int tways = 0;
        if(n-1 >= 0) {
            tways += climbStairsM(n-1,dp);
        }
        if(n-2 >= 0) {
            tways += climbStairsM(n-2,dp);
        }
        if(n-3 >= 0) {
            tways += climbStairsM(n-3,dp);
        }
        return dp[n] = tways;
    }

    public static int climbStairsT(int n) {   //Tabulation
        int dp[] = new int[n+1];

        for(int i = 0; i <= n; i++) {
            if(i == 0) {
                dp[0] = 1;
            }
            else if(i == 1) {
                dp[i] += dp[i-1];
            }
            else if(i == 2) {
                dp[i] = dp[i-1]+ dp[i-2];
            }
            else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            
        }

        return dp[n];
    }
    
    

}
