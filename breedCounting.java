import java.io.*;
import java.util.*;

public class breedCounting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("bcount.in"));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[][] array = new int[4][n + 1];
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bcount.out")));
        for (int i = 1; i < n + 1; i++) {
            int x = Integer.parseInt(br.readLine());
            for (int j = 0; j < 4; j++) {
                array[j][i] = array[j][i - 1];
            }
            array[x][i] = array[x][i] + 1;
        }
        for (int i = 0; i < q; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int holsteins = array[1][b] - array[1][a-1];
            int guernseys = array[2][b] - array[2][a-1];
            int jerseys = array[3][b] - array[3][a-1];
            pw.println(holsteins + " " + guernseys + " " + jerseys);
        }
        pw.close();
    }
}
