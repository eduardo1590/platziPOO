const Car = require("./Car.js");
const Account = require("./Account.js");

var car = new Car("AMQ123", new Account("Andres Herrera", "V20123456"));
car.passenger = 4;
car.printDataCar();