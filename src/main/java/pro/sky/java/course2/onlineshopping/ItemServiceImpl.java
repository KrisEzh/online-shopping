package pro.sky.java.course2.onlineshopping;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class ItemServiceImpl implements ItemService {
    Map<Integer, Integer> items;

    public ItemServiceImpl() {
        items = new HashMap<>();
    }

    @Override
    public Map<Integer, Integer> getItems(Integer itemId) {
        return  items;
    }

    @Override
    public Integer addItems(Integer itemId) {
        if (items.containsKey(itemId)) {
            items.put(itemId, itemId);
        }
        return itemId;
    }
}



