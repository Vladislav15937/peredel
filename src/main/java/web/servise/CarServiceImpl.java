package web.servise;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
@Override
    public List<Car> getCarCount (int id){
        List<Car> spisok;
        spisok = new ArrayList<>();
        spisok.add(new Car("Audi", 1,1));
        spisok.add(new Car("Mercedes", 2,2));
        spisok.add(new Car("Honda",3,3));
        spisok.add(new Car("Tesla",4,4));
        spisok.add(new Car("Toyota", 5,5));

        if (id==1){
            return spisok.subList(0,1);
        } if (id==2){
            return spisok.subList(0,2);
        } if (id==3){
            return spisok.subList(0,3);
        } if(id==4){
            return spisok.subList(0,4);
        } if (id >= 5|| id == -1) {
            return spisok.subList(0,5);
        } else {
            return null;
        }
    }
}
