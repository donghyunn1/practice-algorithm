import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean hasL = false;
        boolean hasK = false;
        boolean hasP = false;
        
        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            if (line.startsWith("l")) {
                hasL = true;
            } else if (line.startsWith("k")) {
                hasK = true;
            } else if (line.startsWith("p")) {
                hasP = true;
            }
        }
        
        if (hasL && hasK && hasP) {
            System.out.println("GLOBAL");
        } else {
            System.out.println("PONIX");
        }
    }
}