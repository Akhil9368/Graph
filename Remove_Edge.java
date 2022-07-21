 void removeEdge(String name1 , String name2){
        vertex one = allVertex.get(name1);
        vertex two = allVertex.get(name2);
        if(one == null || two == null){
            System.out.println("No edge is Found...");
        }
        else if(isEdge(name1 , name2)) {
            one.neigbours.remove(two);
            two.neigbours.remove(one);
        }
        else
            System.out.println("Can't be Terminate....");
        }
