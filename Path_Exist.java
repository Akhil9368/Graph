boolean pathExist(String startVertex,String ReachVertex,HashMap<String,Boolean> visited){
        visited.put(startVertex,true);
        if(isEdge(startVertex,ReachVertex)){
            return true;
        }
        vertex one  = allVertex.get(startVertex);
        Set<String> sets = one.neigbours.keySet();
        for(String set : sets){
            if(!visited.containsKey(set) && pathExist(set,ReachVertex,visited)){
                return true;
            }
        }
        return false;
    }
