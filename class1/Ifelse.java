public class Ifelse {
    public static void main(String[] args) {
        int x = 5; int y = 6;
        if(x < y)
        {
            if(y < 10)
            {
                System.out.println("exp1");
            } else {
                System.out.println("exp2");
            }    
            
            if(y%2 == 0)
            {
                System.out.println("y is even");
            }
        } else {
            System.out.println("exp2");
        }
        
    }
}
