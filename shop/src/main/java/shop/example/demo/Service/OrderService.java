package shop.example.demo.Service;

import org.springframework.stereotype.Service;
import shop.example.demo.Model.Meal;
import shop.example.demo.Model.Order;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    List<Order> orderList;

    public OrderService(){
        super();
        List<Meal> meals=new ArrayList<>();
        meals.add(new Meal("apple",50,"it is gooood"));
        meals.add(new Meal("banana",30,"it is yellow"));

        this.orderList=new ArrayList<>();
        this.orderList.add(new Order("1",80,"leo",meals));
        this.orderList.add(new Order("2",1500,"Ken",meals));
    }

    public Order getOrderBySeq(String seq){
        for(int i=0;i<this.orderList.size();i++){
            if(this.orderList.get(i).getSeq().equals(seq)){
                return this.orderList.get(i);
            }
        }
        return null;
    }

    public int finaltotal(){
        int finaltotal=0;
        for (int i=0;i<this.orderList.size();i++){
            finaltotal+=orderList.get(i).getTotalPrice();
        }
        return finaltotal;
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
