<?php
require_once("Car.php");
require_once("Account.php");
require_once("uberX.php");
require_once("uberPool.php");

/*$car = new Car("AMQ123", new Account("Andres Herrera", "V20123456"));
$car->printDataCar();*/

$uberX = new UberX("AMQ123", new Account("Andres Herrera", "V20123456"), "Toyota", "Corolla");
$uberX->printDataCar();

$uberPool =  new UberPool("AMQ456", new Account("Andrea Herrera", "V2023456"), "Nissan", "Sentra");
$uberPool->printDataCar();