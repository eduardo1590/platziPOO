const Car = require("./Car.js");
const Account = require("./Account.js");
const UberX = require("./UberX.js");

var car = new Car("AMQ123", new Account("Andres Herrera", "V20123456"));
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("AMQ456", new Account("Andrea Herrera", "V20234567"), "Toyota", "Corolla");
uberX.passenger = 4;
uberX.printDataCar();