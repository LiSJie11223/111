package StimulateAndEnum;

import java.util.*;

public class Exam_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mid = new int[10][10];
        mid[1][3] = mid[3][1] = 2;
        mid[1][7] = mid[7][1] = 4;
        mid[1][9] = mid[9][1] = 5;
        mid[2][8] = mid[8][2] = 5;
        mid[3][7] = mid[7][3] = 5;
        mid[3][9] = mid[9][3] = 6;
        mid[4][6] = mid[6][4] = 5;
        mid[7][9] = mid[9][7] = 8;

        while (sc.hasNext()) {
            String s = sc.next();
            boolean[] used = new boolean[10];
            boolean ok = true;

            for (int i = 0; i < s.length(); i++) {
                int cur = s.charAt(i) - '0';

                if (cur < 1 || cur > 9 || used[cur]) {
                    ok = false;
                    break;
                }

                if (i > 0) {
                    int pre = s.charAt(i - 1) - '0';
                    int m = mid[pre][cur];
                    if (m != 0 && !used[m]) {
                        ok = false;
                        break;
                    }
                }

                used[cur] = true;
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}