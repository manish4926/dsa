import java.util.*;

public class Snake {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n =5;
        int m = 6;
        
        ArrayList<String> list = getStairPaths(n,m);
        
        System.out.println(list.size());
        System.out.println(list);
        for (String string : list) {
            System.out.println(string);
            
        }

        scn.close();
    }

    public static ArrayList<String> getStairPaths(int n, int m) {

        if(n ==0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        if(n < 0) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> mypath = new ArrayList<>();


        for(int i = 1; i <= m; i++) {
            ArrayList<String> pathlen = getStairPaths(n - i, m);    
            for (String string : pathlen) {
                mypath.add(String.valueOf(i) + string);
            }
        }

        return mypath;
    }
}
