package org.ies.vehicles.components;

import org.ies.vehicles.model.Vehicle;
import org.ies.vehicles.model.VehicleType;

import java.util.Scanner;

public class VehicleReader {
    private final Scanner scanner;
    private final VehicleType vehicleType;

    public VehicleReader(Scanner scanner, VehicleType vehicleType) {
        this.scanner = scanner;
        this.vehicleType = vehicleType;
    }

    public Vehicle read() {
        int option;
        do {
            System.out.println("Introduce los datos del vehiculo");
            System.out.println("Elige el tipo de vehiculo");
            System.out.println("1. Coche");
            System.out.println("2. Moto");
            System.out.println("3. Camion");
            option = scanner.nextInt;
            scanner.nextLine;
            VehicleType vehicleType;
        } while (option != 1 && option != 2 && option != 3);

        if(option == 1) {
            vehicleType = vehicleType.Car;
        } else if (option == 2) {
            vehicleType = vehicleType.Motorbike;
        } else {
            vehicleType = vehicleType.Truck;
        }

        System.out.println("Velcidad maxima");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine;

        System.out.println("Color");
        String color = scanner.nextLine;

        System.out.println("Matricula");
        String matricula = scanner.nextLine;

       return new Vehicle(
                vehicleType,
                maxSpeed,
                color,
                plate
        );

     }
}
