import java.util.*;

public class GetSubSequenceRecurssion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> list = gss(str);
        System.out.println(list);
        scn.close();
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0) {
            ArrayList<String> blist = new ArrayList<>();
            blist.add("");
            return blist;
        }

        char ch = str.charAt(0);
        String roq = str.substring(1);
        ArrayList<String> subSeq = gss(roq);
        ArrayList<String> mySubSeq = new ArrayList<>();
        for (String s : subSeq) {
            mySubSeq.add(s);
        }

        for (String s : subSeq) {
            mySubSeq.add(ch+s);
        }

        return mySubSeq;
    }
}
