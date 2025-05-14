package com.practice.code;


    class Vehicle {
        protected String brand;
        protected int speed;

        public Vehicle(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed + " km/h");
        }
    }
    class Car extends Vehicle {
        private int numOfDoors;

        public Car(String brand, int speed, int numOfDoors) {
            super(brand, speed);
            this.numOfDoors = numOfDoors;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Number of Doors: " + numOfDoors);
        }
    }
    public class InheritanceDemo {
        public static void main(String[] args) {
            Car myCar = new Car("Toyota", 180, 4);

            System.out.println("Car Details:");
            myCar.displayInfo();
        }
    }
