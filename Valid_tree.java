 private static boolean isTree(ArrayList<ArrayList<Integer>> adjList, int Total_vertex){
          boolean arr [] =  new boolean[Total_vertex];
          //for checking the graph is tree or not mean there is no cycle in the graph and connected to each other
        int startNode =0 ;

          if(isCyclic(startNode,-1,adjList,arr)) return false;
        for (int i = 0; i < Total_vertex; i++) {
            if(!arr[i]){
                return false;
            }
        }
        return true;
    }

    private static boolean isCyclic(int startNode, int i, ArrayList<ArrayList<Integer>> adjList, boolean[] arr) {
        arr[startNode] = true;
        for(Integer val  : adjList.get(startNode)){
             if(!arr[val]){
                 if(isCyclic(val,startNode,adjList,arr));
             }
             else if(val != i) return true;
        }
        return false;
    }
