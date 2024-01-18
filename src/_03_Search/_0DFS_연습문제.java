package _03_Search;

import java.util.LinkedList;
import java.util.Scanner;

//연습 문제
//        "방향이 없는 그래프가 주어졌을 때, 특정 노드로부터 시작하여 깊이 우선 탐색(DFS)을 이용하여 그 노드와 연결된 모든 노드를 방문하는 프로그램을 작성하시오."
//
//        입력:
//        첫 번째 줄에 노드의 개수 N(1 <= N <= 100)과 에지의 개수 M(1 <= M <= 100), 시작 노드 번호 S가 주어진다.
//        두 번째 줄부터 M개의 줄에 걸쳐 에지가 연결하는 두 노드 u와 v가 주어진다(1 <= u, v <= N).
public class _0DFS_연습문제 {
    private static void dfs(LinkedList<Integer>[] graph , boolean visited [] , int node) {
        visited[node] = true;
        System.out.println(node + "");

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(graph, visited, neighbor);
            }
        }
    }
    // 3가지를 받고 시작 그래프의 인접리스트를 나타내는 배열 , 방문한 노드를 알수 있는 boolean 값 , 현재 방문하고 있는 노드
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();

        // 인접리스트 초기화
        LinkedList<Integer> [] graph =new LinkedList[N+1];
        for(int i=1; i<N+1; i++){
            graph[i]= new LinkedList<>();
        }

        // 에지를 통해 인접리스트 구성
        for(int i =0;i<M;i++){
            int u= sc.nextInt();
            int v= sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        // 노드를 돌았는지 방문배열
        boolean visited []= new boolean[N+1];
        dfs(graph,visited,S);
    }

        }


