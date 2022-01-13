package pro.sky.java.course2.onlineshopping;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<Integer, Integer> items;

    public Cart(){
        this.items= new HashMap<>();
    }
    public Map<Integer, Integer> getItems(){
        return items;
    }
}
