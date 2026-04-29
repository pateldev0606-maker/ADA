package ada;

import java.util.*;

public class Kruskal {
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

        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int edgeCount = 0;
        int minCost = 0;

        System.out.println("Edges in MST:");

        while (edgeCount < n - 1) {

            int min = 999;
            int a = -1, b = -1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (cost[i][j] < min) {
                        min = cost[i][j];
                        a = i;
                        b = j;
                    }
                }
            }

            int u = a;
            while (parent[u] != u)
                u = parent[u];

            int v = b;
            while (parent[v] != v)
                v = parent[v];

            if (u != v) {
                System.out.println(a + " - " + b + " = " + min);
                minCost += min;
                parent[u] = v;
                edgeCount++;
            }

            cost[a][b] = cost[b][a] = 999;
        }

        System.out.println("Total Minimum Cost = " + minCost);
        sc.close();
    }
}
