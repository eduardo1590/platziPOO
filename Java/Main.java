class Main{
    public static void main(String[] args) {
        
        Car car = new Car("AMQ123", new Account("Andres Herrera", "V20123456"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "V20234567"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}