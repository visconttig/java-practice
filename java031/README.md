# 🚗 Polymorphism Challenge – Object-Oriented Programming in Action

## 🧠 Your Challenge

Your mission is to design a polymorphic system representing different types of cars using Java. You must:

1. **Create a base `Car` class** that provides the foundational behavior for all types of cars.
2. **Implement three distinct subclasses**:

    * `ElectricCar`
    * `GasPoweredCar`
    * `HybridCar`
3. **Utilize inheritance and method overriding** to customize the behavior of each car type.
4. **Demonstrate polymorphism** by treating each specific car as a generic `Car` type in your main program.
5. **Print each car’s type at runtime** using reflection to reinforce the concept of dynamic dispatch.

---

## ✅ Solution Overview

This project exemplifies key Object-Oriented Programming principles, with a focus on:

* 🔄 **Polymorphism**: The main class treats all car types uniformly through the `Car` superclass, while each subclass provides its own specific behavior.
* 🧬 **Inheritance**: All cars inherit common functionality (`startEngine`, `drive`, `runEngine`) from the base `Car` class.
* 🛠️ **Method Overriding**: Each subclass customizes methods like `startEngine`, `drive`, and `runEngine` to reflect its unique identity.
* 🔒 **Encapsulation**: Fields are kept private and protected, with controlled access through getters/setters.
* 🧼 **Clean Design**: Constructors allow for both default and custom configurations, with sensible defaults provided.

---

## 📁 Project Structure

```
main/
├── Car.java
├── ElectricCar.java
├── GasPoweredCar.java
├── HybridCar.java
└── Main.java
```

---

## 🚙 Base Class – Car

```java
public class Car {
    private String description;
    ...
    public void startEngine() {...}
    public void drive() {...}
    protected void runEngine(int speed) {...}
}
```

* Holds common fields and behavior.
* Implements `startEngine`, `drive`, and a protected `runEngine` method.
* Uses reflection (`getClass().getSimpleName()`) to print dynamic type.

---

## 🔋 ElectricCar | ⛽ GasPoweredCar | ⚡ HybridCar

Each subclass overrides methods and introduces unique attributes:

### GasPoweredCar Example:

```java
public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    @Override
    public void startEngine() {...}

    @Override
    public void drive() {...}

    @Override
    protected void runEngine(int speed) {...}
}
```

* Similar pattern applies for `ElectricCar` and `HybridCar`.
* Demonstrates constructor chaining and field specialization.

---

## 🧪 Main.java – Test Drive

```java
public static void main(String[] args){
    Car car = new Car("2024 Mazda Elixir");
    runCar(car);

    Car ferrari = new HybridCar("2002 Ferrari Carrera", 6, 4, 8);
    runCar(ferrari);

    Car tesla = new ElectricCar("2025 Tesla X", 725, 8);
    runCar(tesla);
}
```

* The `runCar` method accepts any `Car` object and executes shared behavior.
* Actual method execution is determined at runtime — classic polymorphism!

---

## 🎯 What You’re Practicing

✅ Understanding of class hierarchies
✅ Correct use of method overriding
✅ Protected vs private access modifiers
✅ Constructor chaining and overloading
✅ Runtime polymorphism and dynamic dispatch
✅ Encapsulation and clean object-oriented design

---

## 🏁 Final Notes

This challenge not only reinforces **core OOP principles** but also demonstrates how **clean architecture** and **code reuse** can be achieved through polymorphism. The code is structured, readable, and extendable — a solid foundation for building more complex systems.
