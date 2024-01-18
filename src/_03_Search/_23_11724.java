package _03_Search;

import java.util.LinkedList;
import java.util.Scanner;

public class _23_11724 {
    // 구해야하는 것 연결 요소 => 그래프 개수
    // 인접리스트 , 방문배열 구하기
    // ideal : dfs가 호출되는 counter를 활용하자
    // 연결 요소의 개수는 DFS를 시작하는 횟수와 동일합니다. 각각의 DFS 시작은 그래프 내의 별도의 연결된 노드 그룹, 즉 새로운 연결 요소를 탐색
    private static void dfs(LinkedList<Integer>[] graph , boolean visited [], int nodeThis){
        visited [nodeThis] =true;
        for(int ne : graph [nodeThis]){
            if(!visited[ne]){
                dfs(graph, visited, ne);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // 총 노드의 수
        int N = sc.nextInt();
        // 총 에지의 수
        int M = sc.nextInt();
        int startNode =1;

        // 인접리스트 구하기 1.초기화 2. 값넣기
        LinkedList<Integer> [] graph =new LinkedList[N+1];
        for(int i=1; i<N+1; i++){
            graph[i]= new LinkedList<>();
        }
        for(int i=0; i<M; i++){
            int v= sc.nextInt();;
            int u= sc.nextInt();
            graph[v].add(u);
            graph[u].add(v);
        }

        boolean visited [] =new boolean[N+1];
        int connectedComponents = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(graph, visited, i);
                connectedComponents++;
            }
        }

        System.out.println(connectedComponents);
    }
    }

