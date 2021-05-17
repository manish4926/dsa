import java.util.*;

public class GetMazePathRecurssion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();

        ArrayList<String> path = getMazePaths(0,0,nr-1, nc-1);
        System.out.println(path);
        scn.close();
    }    

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> blist = new ArrayList<>();
            blist.add("");
            return blist;
        }

        ArrayList<String> myPath = new ArrayList<>();
        if (sc + 1 <= dc) {
            ArrayList<String> hpath = getMazePaths(sr, sc+1, dr, dc);
            for (String string : hpath) {
                myPath.add("h"+string);
            }
        }

        if (sr + 1 <= dr) {
            ArrayList<String> vpath = getMazePaths(sr + 1, sc, dr, dc);
            for (String string : vpath) {
                myPath.add("v"+string);
            }
        }
        return myPath;
    }
}
