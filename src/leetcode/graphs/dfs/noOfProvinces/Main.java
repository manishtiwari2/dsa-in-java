package leetcode.graphs.dfs.noOfProvinces;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] graph = new int[n][n];

        // Read matrix
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean[] visited = new boolean[n];
        int provinces = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(graph, visited, i);
                provinces++;
            }
        }

        System.out.println(provinces);
    }

    public static void dfs(int[][] graph, boolean[] visited, int node){
        visited[node] = true;

        for(int j = 0; j < graph.length; j++){
            if(graph[node][j] == 1 && !visited[j]){
                dfs(graph, visited, j);
            }
        }
    }
}





//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[][] graph = new int[n][n];
//
//        // Read input
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                graph[i][j] = sc.nextInt();
//            }
//        }
//
//        boolean[] visited = new boolean[n];
//        int provinces = 0;
//
//        // Count connected components
//        for(int i = 0; i < n; i++){
//            if(!visited[i]){
//                dfs(graph, visited, i);
//                provinces++;
//            }
//        }
//
//        // Output result
//        System.out.println(provinces);
//    }
//
//    public static void dfs(int[][] graph, boolean[] visited, int node){
//        visited[node] = true;
//
//        for(int j = 0; j < graph.length; j++){
//            if(graph[node][j] == 1 && !visited[j]){
//                dfs(graph, visited, j);
//            }
//        }
//    }
//}