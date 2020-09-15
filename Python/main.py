from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("AMQ123", Account("Andres Herrera", "V20123456"))
    print(vars(car))
    print(vars(car.driver))