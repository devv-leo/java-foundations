package day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zones {
    
    public static void main(String[] args) {
        Map<String, String> stateZones = new HashMap<>();
        
        stateZones.put("Benue", "North Central");
        stateZones.put("FCT", "North Central");
        stateZones.put("Kogi", "North Central");
        stateZones.put("Kwara", "North Central");
        stateZones.put("Nasarawa", "North Central");
        stateZones.put("Niger", "North Central");
        stateZones.put("Plateau", "North Central");
        
        stateZones.put("Adamawa", "North East");
        stateZones.put("Bauchi", "North East");
        stateZones.put("Borno", "North East");
        stateZones.put("Gombe", "North East");
        stateZones.put("Taraba", "North East");
        stateZones.put("Yobe", "North East");

        stateZones.put("Kaduna", "North West");
        stateZones.put("Katsina", "North West");
        stateZones.put("Kano", "North West");
        stateZones.put("Kebbi", "North West");
        stateZones.put("Sokoto", "North West");
        stateZones.put("Jigawa", "North West");
        stateZones.put("Zamfara", "North West");

        stateZones.put("Abia", "South East");
        stateZones.put("Anambra", "South East");
        stateZones.put("Ebonyi", "South East");
        stateZones.put("Enugu", "South East");
        stateZones.put("Imo", "South East");

        stateZones.put("Akwa-Ibom", "South-South");
        stateZones.put("Bayelsa", "South-South");
        stateZones.put("Cross-River", "South-South");
        stateZones.put("Delta", "South-South");
        stateZones.put("Edo", "South-South");
        stateZones.put("Rivers", "South-South");

        stateZones.put("Ekiti", "South West");
        stateZones.put("Lagos", "South West");
        stateZones.put("Osun", "South West");
        stateZones.put("Ondo", "South West");
        stateZones.put("Ogun", "South West");
        stateZones.put("Oyo", "South West");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Nigerian state: ");
        String state = scanner.nextLine();
        
        String zone = stateZones.get(state);
        if (zone != null) {
            System.out.println(state + " belongs to the " + zone + " geopolitical zone.");
        } else {
            System.out.println("State not found or not recognized. Please check the spelling.");
        }
        
        scanner.close();
    }
}
