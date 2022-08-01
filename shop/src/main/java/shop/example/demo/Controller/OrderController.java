package shop.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import shop.example.demo.Model.Order;
import shop.example.demo.Service.MealService;
import shop.example.demo.Service.OrderService;

@Controller

@RequestMapping(value="/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/{seq}")
    public String getOrderBySeq(@PathVariable String seq, Model model){
        Order order =this.orderService.getOrderBySeq(seq);
        model.addAttribute("order",order);
        return "order";
    }
}
