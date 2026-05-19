import java.util.ArrayList;
import java.util.Random;

public class Helper {
    // Метод вибору випадкового авто
    public static void dispatchRandomCar(ArrayList<TaxiCar> cars) {
        int randomIndex = new Random().nextInt(cars.size());
        TaxiCar selectedCar = cars.get(randomIndex);
        
        System.out.println("Автомобіль марки " + selectedCar.brand + 
                           " з водієм " + selectedCar.driver.name + " виїхав за вами.");
        
        // Передача авто в наступний метод
        arrive(selectedCar);
    }

    // Метод прибуття
    public static void arrive(TaxiCar car) {
        System.out.println("Водій " + car.driver.name + " прибув на місце.");
    }
}