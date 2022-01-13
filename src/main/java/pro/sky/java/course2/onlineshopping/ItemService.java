package pro.sky.java.course2.onlineshopping;

import java.util.Map;

public interface ItemService {

    Map<Integer, Integer> getItems(Integer itemId);

    Integer addItems(Integer itemId);
}
