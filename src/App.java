import java.util.TreeMap;

public class App {

    // FloorEntry => Lower Entry value
    // CeilingEntry => Higher Entry value
    private TreeMap<Integer, Integer> eventsCalendar;

    public App() {
        eventsCalendar = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        // Condition at start time
        // start < lower Entry End Time
        if (eventsCalendar.floorEntry(start) != null && start < eventsCalendar.floorEntry(start).getValue()) {
            return false;
        }

        // Condiont at end time
        // end > Higher Entry Start Time
        if (eventsCalendar.ceilingEntry(start) != null && end > eventsCalendar.ceilingEntry(start).getKey()) {
            return false;
        }
        eventsCalendar.put(start, end);
        return true;
    }

}
