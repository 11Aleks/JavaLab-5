/**
 * Represents an aircraft
 */
public class Aircraft {
    private String model;
    private int capacity;
    private int payload;
    private int range;
    private int fuelConsumption;
    /**
     * Constructs an Aircraft object
     *
     * @param model           The model
     * @param capacity        The passenger capacity
     * @param payload         The payload
     * @param range           The maximum flight range
     * @param fuelConsumption The fuel consumption
     */
    public Aircraft(String model, int capacity, int payload, int range, int fuelConsumption) {
        this.model = model;
        this.capacity = capacity;
        this.payload = payload;
        this.range = range;
        this.fuelConsumption = fuelConsumption;
    }
    /**
     * @return The model of the aircraft
     */
    public String getModel() {
        return model;
    }
    /**
     * @return The passenger capacity of the aircraft
     */
    public int getCapacity() {
        return capacity;
    }
    /**
     * @return The payload  of the aircraft
     */
    public int getPayload() {
        return payload;
    }
    /**
     * @return The maximum flight range of the aircraft
     */
    public int getRange() {
        return range;
    }
    /**
     * @return The fuel consumption of the aircraft
     */
    public int getFuelConsumption() {
        return fuelConsumption;
    }
}

