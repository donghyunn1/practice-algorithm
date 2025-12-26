import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        while (!str.equals("end")) {
            if (str.equals("animal")) {
                System.out.println("Panthera tigris");
            } else if (str.equals("tree")) {
                System.out.println("Pinus densiflora");
            } else if (str.equals("flower")) {
                System.out.println("Forsythia koreana");
            }
            str = br.readLine();
        }
    }
}