package ada;

import java.util.*;

public class Prims {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] cost = new int[n][n];

        System.out.println("Enter adjacency matrix (enter 999 for no edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        boolean[] visited = new boolean[n];
        visited[0] = true;   // Start from vertex 0

        int edgeCount = 0;
        int minCost = 0;

        System.out.println("Edges in MST:");

        while (edgeCount < n - 1) {

            int min = 999;
            int a = -1, b = -1;

            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    for (int j = 0; j < n; j++) {
                        if (!visited[j] && cost[i][j] < min) {
                            min = cost[i][j];
                            a = i;
                            b = j;
                        }
                    }
                }
            }

            if (a != -1 && b != -1) {
                System.out.println(a + " - " + b + " = " + min);
                minCost += min;
                visited[b] = true;
                edgeCount++;
            }
        }

        System.out.println("Total Minimum Cost = " + minCost);
        sc.close();
    }
}
