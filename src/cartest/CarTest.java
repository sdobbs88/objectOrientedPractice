
public class CarTest {
    
    public static void main(String[] args) {
        Car toyCar = new Car();
        toyCar.setGear(Car.PARK);
        toyCar.startEngine();
        System.out.println(toyCar.toString());
        toyCar.stopEngine();
        System.out.println(toyCar.toString());
        
        Car honCar = new Car(2012, "Honda", "Accord");
        honCar.startEngine();
        System.out.println(honCar.toString());
        honCar.stopEngine();
        System.out.println(honCar.toString());
        
        Car mazCar = new Car(2014, "Mazda");
        mazCar.startEngine();
        System.out.println(mazCar.toString());
        mazCar.stopEngine();
        System.out.println(mazCar.toString());
    }
    
}