import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Car,CarImpl> map = new HashMap<>();
        map.put(new Car(22,"MERSEDES BENS"),new CarImpl(LocalDate.of(2022,11,23),"AMG 63",300000,"Blue"));
        map.put(new Car(21,"MERSEDES BENS"),new CarImpl(LocalDate.of(2023,1,12),"AMG 800",500000,"Blue"));
        System.out.println(map.entrySet());
    }
}