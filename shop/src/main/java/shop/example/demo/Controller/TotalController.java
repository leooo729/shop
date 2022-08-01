package shop.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import shop.example.demo.Model.Order;
import shop.example.demo.Service.OrderService;

import java.util.List;

@Controller
public class TotalController {
    @Autowired
    OrderService orderService;

    @GetMapping("/total")
    public String getfinaltotal(Model model){
        int finaltotal =this.orderService.finaltotal();
        model.addAttribute("total",finaltotal);

        List<Order> finallist=this.orderService.getOrderList();
        model.addAttribute("order",finallist);
        return "total";
    }




}
