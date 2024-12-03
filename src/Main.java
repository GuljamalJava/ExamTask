import car.Car;
import car.CarType;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Car car1 = new Car();

    public static void main(String[] args) {


        System.out.println("create car:");
        System.out.println(car1.addCar(new Car(CarType.SEDAN, 1L, LocalDate.of(2020, 4, 7), "AMG", "MERS", 38474.45)));
        System.out.println(car1.addCar(new Car(CarType.CABRIOLET, 2L, LocalDate.of(2010, 5, 7), "kf", "BMW", 34574.45)));
        System.out.println(car1.addCar(new Car(CarType.CROSSOVER, 3L, LocalDate.of(2023, 4, 7), "AMG", "Jipp", 45474.45)));
        System.out.println(car1.addCar(new Car(CarType.HATCHBACK, 4L, LocalDate.of(2013, 4, 7), "AMG", "honda", 8474.45)));


//                System.out.println("updateCar:");
//                System.out.println(car1.updateCar(1L, new Car(CarType.SEDAN, 5L, LocalDate.of(2013, 7, 15), "fit", "Honda", 5000.00)));

//
//        System.out.println("findByid:");
//        car1.findByid(3L);
//
        System.out.println("Get All:");
        Car[] cars1 = car1.getAllCars();
        System.out.println(Arrays.toString(cars1));
//
        System.out.print("Delete by id: ");
        System.out.println(car1.deleteById(1L));

        System.out.println("Get All:");
        Car[] cars2 = car1.getAllCars();
        System.out.println(Arrays.toString(cars2));

    }

}



