  void removeVertex(String name){
        if(!allVertex.containsKey(name)){
            System.out.println("Vertex Not Found");
        }
        else
        {
            vertex one = allVertex.get(name);
            Set<String> set = one.neigbours.keySet();
            for (String s : set) {
                vertex neighbourvertex = allVertex.get(s);
                neighbourvertex.neigbours.remove(name);
            }
            allVertex.remove(name);
        }
        }
