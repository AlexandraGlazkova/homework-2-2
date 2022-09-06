public class Main {
    public static void main(String[] args) {

        Car car = new Car("Нива", 4, "поршневой");
        Car car2 = new Car("Ford", 4, "турбинный");
        Truck truck = new Truck("truck1", 6, "engine type1", "type of trailer1");
        Truck truck2 = new Truck("truck2", 8, "engine type2", "type of trailer2");
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        car.check();
        bicycle2.check();
        truck.check();
    }

}