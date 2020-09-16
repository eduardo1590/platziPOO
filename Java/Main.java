class Main{
    public static void main(String[] args) {
        
        Car car = new Car("AMQ123", new Account("Andres Herrera", "V20123456"));
        car.setPassenger(4);
        car.printDataCar();

        UberX uberX = new UberX("QWE567", new Account("Andrea Herrera", "V20234567"), "Toyota", "Corolla");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("QWE123", new Account("Andy Herrera", "V20345678"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}