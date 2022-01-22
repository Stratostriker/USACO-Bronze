import java.io.*;
import java.util.*;

public class haybaleStacking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("stacking.in"));;
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("stacking.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] prefix = new int[n + 1];
        for (int i = 0; i < k; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            prefix[a - 1] ++;
            prefix[b] --;
        }
        int total = 0;
        int[] finish = new int[n];
        for (int i = 0; i < n; i++) {
            total += prefix[i];
            finish[i] = total;
        }
        Arrays.sort(finish);
        pw.println(finish[n / 2]);
        pw.close();
    }
}
