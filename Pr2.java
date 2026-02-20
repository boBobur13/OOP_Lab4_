import java.util.Scanner;
import java.util.Random;

public class Pr2 {
    
    static class Sensor {
        private String location;
        private double reading;

        public Sensor(String location, double reading) {
            this.location = location;
            if (reading < -50.0 || reading > 50.0) {
                this.reading = 0.0;
            } else {
                this.reading = reading;
            }
        }

        public String getLocation() {
            return location;
        }

        public double getReading() {
            return reading;
        }

        public void displayInfo() {
            System.out.println("Location: " + location + ", Temperature: " + reading + "°C");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        Sensor[] sensors = new Sensor[5];
        
        System.out.println("===== TEMPERATURE SENSOR ARRAY =====");
        System.out.println("1 - Manual input");
        System.out.println("2 - Random generation");
        System.out.print("Choice: ");
        
        int choice = input.nextInt();
        input.nextLine();
        
        if (choice == 1) {
            System.out.println("\n--- Enter 5_sensors ---");
            
            for (int i = 0; i < sensors.length; i++) {
                System.out.println("\nSensor " + (i+1) + ":");
                System.out.print("Location: ");
                String loc = input.nextLine();
                System.out.print("Temperature: ");
                double temp = input.nextDouble();
                input.nextLine();
                
                sensors[i] = new Sensor(loc, temp);
            }
        } else {
            System.out.println("\n--- Generating random data ---");
            
            String[] locations = {"Tashkent", "Samarkand", "Bukhara", "Xiva", "Andijan", 
                                  "Namangan", "Fergana", "Karshi", "Nukus", "Gulistan"};
            
            for (int i = 0; i < sensors.length; i++) {
                String loc = locations[random.nextInt(locations.length)];
                double temp = -30 + (random.nextDouble() * 70);
                temp = Math.round(temp * 10) / 10.0;
                
                sensors[i] = new Sensor(loc, temp);
                System.out.println("Sensor " + (i+1) + ": " + loc + ", " + temp + "°C");
            }
        }
        
        System.out.println("\n===== ALL SENSORS ====");
        double sum = 0;
        
        for (int i = 0; i < sensors.length; i++) {
            System.out.print((i+1) + ". ");
            sensors[i].displayInfo();
            sum += sensors[i].getReading();
        }
        double average = sum / sensors.length;
        average = Math.round(average * 10) / 10.0;
        
        System.out.println("\n===== RESULTS =====");
        System.out.println("Average temperature: " + average + "°C");
        
        input.close();
    }
}
