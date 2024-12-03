import java.util.List;
/**
 * This class demonstrates the usage of the Aircompany and Aircraft classes.
 */
public class Main {
    public static void main(String[] args) {
        /**
         *Create aircraft objects
         */
        Aircraft aircraft1 = new Aircraft("Boeing 747", 416, 184990, 13700, 10000);
        Aircraft aircraft2 = new Aircraft("Airbus A380", 525, 236800, 15200, 12000);
        Aircraft aircraft3 = new Aircraft("Boeing 737", 200, 20000, 5700, 5000);

        /**
         * Create aircompany and add aircraft into them
         */
        Aircompany airline = new Aircompany("SashaAirlines");
        airline.addAircraft(aircraft1);
        airline.addAircraft(aircraft2);
        airline.addAircraft(aircraft3);
        /**
         * Display total passenger capacity and payload
         */
        System.out.println("Загальна місткість авіакомпанії: " + airline.getTotalCapacity());
        System.out.println("Загальна вагопідйомність авіакомпанії: " + airline.getTotalPayload());

        /**
         * Display aircraft sorted by flight range
         */
        System.out.println("Сортування літаків компанії за дальністю польоту:");
        List<Aircraft> sortedByRange = airline.getAircraftSortedByRange();
        for (Aircraft aircraft : sortedByRange) {
            System.out.println(aircraft.getModel() + " - " + aircraft.getRange() + " км");
        }

        /**
         *Filter and display aircraft by fuel consumption range
         */
        int fuelRangeMin = 5000;
        int fuelRangeMax = 8000;
        System.out.println("Літаки по заданому діапазону споживання пального" + fuelRangeMin + " до " + fuelRangeMax + ":");
        List<Aircraft> filteredByFuel = airline.filterAircraftByFuelConsumption(fuelRangeMin, fuelRangeMax);
        for (Aircraft aircraft : filteredByFuel) {
            System.out.println(aircraft.getModel() + " - " + aircraft.getFuelConsumption() + " л");
        }
    }
}
