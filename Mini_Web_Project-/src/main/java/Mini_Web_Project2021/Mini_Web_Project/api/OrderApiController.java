package Mini_Web_Project2021.Mini_Web_Project.api;

import Mini_Web_Project2021.Mini_Web_Project.domain.Order;
import Mini_Web_Project2021.Mini_Web_Project.repository.OrderRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //데이터 통신방법
@RequiredArgsConstructor
public class OrderApiController {

    private final OrderRepository orderRepository;

    //컨트롤러
    @PostMapping("/api/orders")
    public CreateOrderResponse registerOrder(@RequestBody Order order){

        Long id = orderRepository.join(order);

        return new CreateOrderResponse(id);
    }

    //모델
    @Data
    static class CreateOrderRequest{
        private String subject;
        private int total;
    }
    @Data
    class CreateOrderResponse{
        private Long id;

        public CreateOrderResponse(Long id){
            this.id = id;
        }
    }

}
