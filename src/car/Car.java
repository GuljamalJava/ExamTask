package car;

import java.time.LocalDate;
import java.util.Arrays;

public class Car {
    private long id;
    private String model;
    private String name;
    private double price;
    private LocalDate issueDate;
    private CarType carType;


    // class
    Car[] cars = new Car[0];
    int size = 0;

    public Car(CarType carType, long id, LocalDate issueDate, String model, String name, double price) {
        this.carType = carType;
        this.id = id;
        this.issueDate = issueDate;
        this.model = model;
        this.name = name;
        this.price = price;


    }

    public Car() {
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Car addCar(Car newCar) {
        cars = Arrays.copyOf(cars, cars.length + 1);
        cars[cars.length - 1] = newCar;
        return newCar;
    }

    public String addCars(Car[] newCars) {
        for (Car car : cars) {
            addCar(car);
        }
        return "success added cars array";

    }

    public Car[] getAllCars() {
     boolean is = false;
        for (int i = 0; i < cars.length; i++) {
            is = true;
            System.out.println(cars[i]);
        }
        return  cars;
    }

    public void findByid(long id) {
        boolean is = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId() == id) {
                is = true;
                System.out.println(cars[i].toString());
            }
        }
    }
    public String updateCar ( long id, Car newCar){
            for (Car car : cars) {
                if (car.getId() == id) {
                    car.setName(newCar.getName());
                    car.setModel(newCar.getModel());
                    car.setCarType(newCar.getCarType());
                    car.setPrice(newCar.getPrice());
                    car.setIssueDate(newCar.getIssueDate());
                    return "Success updated" + newCar;
                }
            }

            return null;
        }

        public String deleteById ( long id){
            boolean is = false;
//            for (int i = 0; i < size; i++) {
//                if (cars[i].getId() == id) {
//                    is = true;
//                    for (int j = i; j < size - 1; j++) {
//                        cars[i] = cars[j + 1];
//                    }
//                    size--;
//                }
//            }
//            cars = Arrays.copyOf(cars, cars.length - 1);

            Car[] cars1 = new Car[0];
            for (Car car : cars) {
                    if (car.getId() != id){
                        is = true;
                        cars1 = Arrays.copyOf(cars1, cars1.length + 1);
                        cars1[cars1.length - 1] = car;
                    }
            }
            cars = cars1;
            return  is ? "Success deleted car by id " + id : "Car by id "+ id + " not found!";
        }


        @Override
        public String toString () {
            return "Car{" +
//                    "cars=" + Arrays.toString(cars) +
                    ", id=" + id +
                    ", model='" + model + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", issueDate=" + issueDate +
                    ", carType=" + carType +

                    '}';
        }

    }





