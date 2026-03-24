package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zones {
    
    public static void main(String[] args) {
        Map<String, String> stateZones = new HashMap<>();
        
        stateZones.put("Benue", "North Central");
        stateZones.put("FCT", "North Central");
        stateZones.put("Kogi", "North Central");
        stateZones.put("Kwara", "North Central");
        stateZones.put("Nasarawa", "North Central");
        stateZones.put("Niger", "North Central");
        stateZones.put("Plateau", "North Central");
        
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
