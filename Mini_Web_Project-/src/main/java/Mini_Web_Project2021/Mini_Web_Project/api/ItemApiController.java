package Mini_Web_Project2021.Mini_Web_Project.api;

import Mini_Web_Project2021.Mini_Web_Project.domain.Item;
import Mini_Web_Project2021.Mini_Web_Project.repository.ItemRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ItemApiController {

    private final ItemRepository itemRepository;

    @PostMapping("/api/items")
    public CreateItemResponse registerItem(@RequestBody Item item)
    {
        String name = itemRepository.register(item);
        return new CreateItemResponse(name);
    }

    @Data
    static class CreateItemRequest{
        private String name;
        private int price;
    }

    @Data
    class CreateItemResponse{
        private String name;

        public CreateItemResponse(String name) {
            this.name = name;
        }
    }
}
