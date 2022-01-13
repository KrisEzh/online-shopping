package pro.sky.java.course2.onlineshopping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class ItemController {
    private final ItemService itemService;
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping(path = "/add")
    public String addItem(@RequestParam("id") Integer itemId) {
        itemService.addItems(itemId);
        return  "Товар добавлен " + itemId;
    }


    @GetMapping(path = "/get")
    public Map<Integer, Integer> getItems(Integer itemId) {
        return itemService.getItems(itemId);
    }

    }
