import javax.swing.*;

public class Mininmum_Spanning_tree_Prism {
    final static int TOTAL_VERTEX = 6;
    public static void main(String[] args) {
        int graph[][] = {
                {0,4,6,0,0,0},
                {4,0,6,3,4,0},
                {6,6,0,1,0,0},
                {0,3,1,0,2,3},
                {0,4,0,2,0,7},
                {0,0,0,3,7,0}
        };
        mst(graph);
    }
    private static void mst(int[][] graph) {
        int weight [] = new int[TOTAL_VERTEX];
        for (int i = 1; i < TOTAL_VERTEX; i++) {
                weight[i] = Integer.MAX_VALUE;
        }
        boolean Mset[] = new boolean[TOTAL_VERTEX];
        int parent [] = new int[TOTAL_VERTEX];

        weight[0]= 0;
        parent[0] =-1;
        for (int i = 1; i < TOTAL_VERTEX; i++) {
              int SourceVertex = getMinimumVertex(Mset,weight);
                Mset[SourceVertex] = true;
            for (int j = 1; j < TOTAL_VERTEX; j++) {
                if(graph[SourceVertex][j] != 0 && graph[SourceVertex][j]<weight[j] && !Mset[j]){
                    weight[j] = graph[SourceVertex][j];
                    parent[j]= SourceVertex;
                }
            }
        }
        for (int i=1;i<TOTAL_VERTEX;i++){
            System.out.println(parent[i] + " " + i + " " + graph[parent[i]][i]);
        }
    }

    private static int getMinimumVertex(boolean Mset[],int weight[]) {
        int min = Integer.MAX_VALUE;
        int vertex=0;
        for (int i = 0; i < TOTAL_VERTEX-1; i++) {
            if(!Mset[i] && weight[i]<min){
                vertex =i;
                min = weight[i];

            }

        }
        return vertex;
    }
}
