import java.io.*;
import java.util.*;

public class teleportation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("teleport.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int min = Math.abs(b-a);
        min = Math.min(min, Math.abs(b-y) + Math.abs(x-a));
        min = Math.min(min, Math.abs(b-x) + Math.abs(y-a));
        pw.println(min);
        pw.close();
    }
}
