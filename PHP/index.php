<?php
require_once("Car.php");
require_once("Account.php");

$car = new Car("AMQ123", new Account("Andres Herrera", "V20123456"));
$car->printDataCar();