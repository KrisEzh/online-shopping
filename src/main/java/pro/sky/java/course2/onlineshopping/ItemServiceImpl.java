package pro.sky.java.course2.onlineshopping;

import org.springframework.stereotype.Service;


import java.util.*;

@Service

public class ItemServiceImpl implements ItemService {
    private final Cart cart;

    public ItemServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public Map<Integer, Integer> getItems(Integer itemId) {
        return  cart.getItems();
    }

    @Override
    public Integer addItems(Integer itemId) {
        cart.getItems().put(itemId, itemId);
        return itemId;
    }
}



