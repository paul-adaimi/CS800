import java.util.Arrays;
import java.util.List;

// This exercise is for Problem #3 of the problem set
public class Main {
    public static void main(String[] args) {
        // Modify array list integers in the line below.
        List<Integer> list= Arrays.asList(5, 4, 3, 2, 1);

        // Modify threshold in variable below
        int threshold = 1;

        int criticalEvents = getCriticalEventsInArray(list, threshold);

        System.out.println("The number of critical events in the array are " + criticalEvents);
    }

    // This is the Algorithm function.
    public static int getCriticalEventsInArray(List<Integer> list, int threshold) {
        int criticalEvents = 0;
        for (int i=0; i < list.size()-1; i++) {
            for (int j=i+1; j < list.size(); j++) {
                if (list.get(i) > threshold * list.get(j)) {
                    criticalEvents++;
                }
            }
        }

        return criticalEvents;
    }
}