package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] n = new int[a][b];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = sc.nextInt();
            }
        }

        int c = sc.nextInt();
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] == c) {
                    System.out.print("Position: ");
                    System.out.println(i + "," + j);

                    if (j > 0) {
                        Integer left = n[i][j - 1];
                        System.out.println("Left: " + left);
                    }

                    if (j < n[i].length - 1) {
                        Integer right = n[i][j + 1];
                        System.out.println("Right: " + right);
                    }

                    if (i > 0) {
                        Integer up = n[i - 1][j];
                        System.out.println("Up: " + up);
                    }

                    if (i < n.length - 1) {
                        Integer down = n[i + 1][j];
                        System.out.println("Down: " + down);
                    }
                }
            }
        }
        sc.close();
    }
}
