import java.io.*;
import java.util.*;

public class ArrayListRemovePrimes {
    public static void solution(ArrayList<Integer> al) {
        // write your code here
        int aSize = al.size();

        for (int i = aSize - 1; i >= 0; i--) {
            boolean flag = false;
            for (int j = 2; j * j <= al.get(i); j++) {
                // System.out.println(al.get(i));
                if (al.get(i) % j == 0) {
                    flag = true;
                    break;
                }

            }

            if (flag == false) {
                al.remove(i);
                // System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);

        scn.close();
	}
}
