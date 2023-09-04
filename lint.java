import java.util.Scanner;
public class lint {
    public static void main(String args[]) {
        int[][] a =
                {
                        {1, 2, 3, 4},
                        {1},
                        {1, 2}
                };
        int[][] c =
                {
                        {1, 2, 3, 4},
                        {1, 4},
                        {1, 4}
                };
        boolean d = true;
        if (a.length != c.length)
            d = false;
        for (int i = 0; i < a.length; i++) {
            if (!d) break;
            if (a[i].length != c[i].length) {
                d = false;
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (!d) break;
            for (int j = 0; j < a[i].length; j++) {
                if (!d) break;
                if (a[i][j] != c[i][j]) {
                    d = false;
                    break;
                }
            }
        }
        if (d) System.out.println("равны");
        else System.out.println("не равны");
    }}