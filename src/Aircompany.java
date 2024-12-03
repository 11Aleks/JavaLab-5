import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Represents an aircompany
 */
public class Aircompany {
    private String name;
    private List<Aircraft> aircraftList;
    /**
     * Constructs an aircompany object
     *
     * @param name The name of the aircompany
     */
    public Aircompany (String name) {
        this.name = name;
        this.aircraftList = new ArrayList<>();
    }
    /**
     * Adds an aircraft to the aircompany
     *
     * @param aircraft The aircraft to be added
     */
    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }
    /**
     * Calculates the total passenger capacity
     *
     * @return The total passenger capacity
     */
    public int getTotalCapacity() {
        return aircraftList.stream().mapToInt(Aircraft::getCapacity).sum();
    }
    /**
     * Calculates the total payload
     *
     * @return The total payload
     */
    public int getTotalPayload() {
        return aircraftList.stream().mapToInt(Aircraft::getPayload).sum();
    }
    /**
     * Sorts the aircraft in the aircompany  by their flight range
     *
     * @return A list of aircraft sorted by flight range
     */
    public List<Aircraft> getAircraftSortedByRange() {
        return aircraftList.stream()
                .sorted((a1, a2) -> Integer.compare(a2.getRange(), a1.getRange()))
                .collect(Collectors.toList());
    }
    /**
     * Filters the aircraft in the aircompany by fuel range.
     *
     * @param minFuel The minimum fuel consumption
     * @param maxFuel The maximum fuel consumption
     * @return A list of aircrafts which a true for our filters
     */
    public List<Aircraft> filterAircraftByFuelConsumption(int minFuel, int maxFuel) {
        return aircraftList.stream()
                .filter(a -> a.getFuelConsumption() >= minFuel && a.getFuelConsumption() <= maxFuel)
                .collect(Collectors.toList());
    }
}

