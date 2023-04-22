package SimpleBox;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class LRUCache<T> {
    private ArrayList<T> list;
    private  Integer size;
    public LRUCache(Integer size) {
        this.size = size;
        this.list = new ArrayList<>();
    }
    public void addElement(T element){
        if(this.list.size() < size){
            this.list.add(element);
        }
        else {
            this.list.remove(0);
            this.list.add(element);
        }
    }
    public T getElement(Integer pos){
        if(pos < list.size() && pos > -1){
            return list.get(pos);
        }
        else{
            System.out.println("No element");
            return null;
        }
    }
    public List<T> getAllEl(){
        return list;
    }
}

