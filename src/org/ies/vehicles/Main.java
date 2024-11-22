package org.ies.vehicles;

import org.ies.vehicles.components.GarageReader;
import org.ies.vehicles.components.VehicleReader;
import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.Vehicle;
import org.ies.vehicles.model.VehicleType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleReader vehicleReader = new VehicleReader();
        GarageReader garageReader = new GarageReader();

        Garage garage = garageReader.read();

        Garage garage = new Garage (
                "Mazda",
                "Calle 3",
                vehicles
        );
    }
}