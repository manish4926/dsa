import java.util.*;

public class JavaEndOfFile {
    public static void main(String[] args) {
         //Create Scanner object  
        Scanner scn = new Scanner(System.in);
        int i = 1;
        while (scn.hasNext()) {
            String x = scn.nextLine();
            System.out.println(i + " " + x);
            i++;
            
        }
        scn.close();

    }
}
