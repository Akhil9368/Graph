  class Pair{
        String newValue;
        String ProceedTill;
    }
boolean bfs(String StartName , String Target){
        HashMap<String,Boolean> hMap = new HashMap<>();
        Queue<Pair> que = new LinkedList<>();
        Pair pair = new Pair();
        pair.newValue = StartName;
        pair.ProceedTill = StartName;
        que.add(pair);
        while(!que.isEmpty()){
            Pair p = que.poll();
            if(hMap.containsKey(p.newValue)){
                continue;
            }
            hMap.put(p.newValue,true);
            if(isEdge(p.newValue , Target)){
                return true;
            }
            Set<String> set =allVertex.get(p.newValue).neigbours.keySet();
            for(String keys : set){
                if(!hMap.containsKey(keys)) {
                    Pair p1 = new Pair();
                    p1.ProceedTill = keys + p1.ProceedTill;
                    p1.newValue = keys;
                    que.add(p1);
                }

            }


        }
        return  false;

      }
