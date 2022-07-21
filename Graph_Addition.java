import java.util.HashMap;
import java.util.Map;

class vertex{
   HashMap<String,Integer> neigbours = new HashMap<>();
}
class Graph{
    HashMap<String,vertex> allVertex= new HashMap<>();
    // total vertex
    int totalVertex(){
        return allVertex.size();
    }
    void addVertex(String Name){
     vertex ver =new vertex();
     allVertex.put(Name,ver);
    }
    boolean isEdge(String name1 , String name2){
        vertex one = allVertex.get(name1);
        vertex two = allVertex.get(name2);
         return (one.neigbours.containsKey(two));
    }
    void addEdges(String name1 , String name2 , int cost){
        vertex one = allVertex.get(name1);
        vertex two = allVertex.get(name2);
        if(isEdge(name1 ,name2)){
            System.out.println("Edge Already Exist...");
            return;
        }
        if(one == null || two == null){
                System.out.println("Need two Vertex....");
                return;
        }
        else {
            one.neigbours.put(name2, cost);
            two.neigbours.put(name1, cost);
        }

        }
        void print(){
        for(Map.Entry<String,vertex> m : allVertex.entrySet()){
            System.out.println(m.getKey() + " ==>" + m.getValue().neigbours);
        }
        }
}
public class graph_Opereations {
    public static void main(String[] args) {
        Graph gp  =  new Graph();
        gp.addVertex("A");
        gp.addVertex("B");
        gp.addVertex("C");
        gp.addVertex("D");
        gp.addVertex("E");
        gp.addVertex("F");
        gp.addVertex("G");
        gp.addEdges("A","B",2);
        gp.addEdges("A","D",5);
        gp.addEdges("B","C",4);
        gp.addEdges("D","C",1);
        gp.addEdges("D","E",3);
        gp.addEdges("E","F",7);
        gp.addEdges("F","G",9);
        gp.addEdges("E","G",8);
        gp.print();

    }
}
