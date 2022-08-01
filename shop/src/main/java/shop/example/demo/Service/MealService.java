package shop.example.demo.Service;

import org.springframework.stereotype.Service;
import shop.example.demo.Model.Meal;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealService {

    List<Meal> mealList;

    public MealService(){
        //super();
        this.mealList=new ArrayList<>();
        this.mealList.add(new Meal("apple",50,"it is gooood"));
    }

    public Meal getMealByName(String name){
        for(int i=0;i<this.mealList.size();i++){
            if(this.mealList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return this.mealList.get(i);
            }
        }
        return null;
    }


}
