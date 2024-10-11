import java.util.*;

 class Node {
    int key;
    int value;
    Node(int key, int value){
        this.key=key;
        this.value=value;
    }
}

//Hash table functons
class HashTable{
    private int size;
    private List<List<Node>> table;
    HashTable(int size){
        this.size=size;
        this.table=new ArrayList<>(size);
        for(int i=0;i<size;i++){
            table.add(new ArrayList<>());
        }
    }
    public int hashFunction(int key){
        return key%size;
    }
    public void insert(int key ,int value){
        int index=hashFunction(key);
        List<Node> list=table.get(index);
        list.add(new Node(key, value));
    }
    public int search(int key){
        int index=hashFunction(key);
        List<Node> list =table.get(index);
        for(Node n:list){
            if(n.key==key){
                return n.value;
            }
            
        }
        return -1;
    }
}

public class Hashsearch{
    public static void main(String[] args){
    int tablesize=10;
    HashTable ht=new HashTable(tablesize);
    ht.insert(2,300);
    ht.insert(4,500);
    ht.insert(5,200);
    ht.insert(6,700);
    if(ht.search(5)!=-1){
        System.out.println("Key is found");
    }
    else{
        System.out.println("Bad luck Key is not found");
    }
    }
}