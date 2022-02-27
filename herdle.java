import java.io.*;
import java.util.*;

public class herdle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int[] breeds1 = new int[26];
        char[][] correct = new char[3][3];
        char[][] guess = new char[3][3];
        int green = 0;
        int yellow = 0;

        for(int i = 0; i < 3; i++) {
            String cor = br.readLine();
            for(int j = 0; j < 3; j++) {
                correct[i][j] = cor.charAt(j);
                breeds1[correct[i][j] - 65]++;
            }
        }
        for(int i = 0; i < 3; i++) {
            String gue = br.readLine();
            for(int j = 0; j < 3; j++) {
                guess[i][j] = gue.charAt(j);
                if(breeds1[guess[i][j] - 65] >= 1) {
                    yellow++;
                    breeds1[guess[i][j] - 65]--;
                }
                if(guess[i][j] == correct[i][j]) {
                    green++;
                    yellow--;
                }
            }
        }
        pw.println(green);
        pw.println(yellow);
        pw.close();
    }
}
