import java.util.ArrayList;
import java.util.List;

public class CoffeLover {
    private List<CoffeMachine> coffeMachines;

    // Constructor
    public CoffeLover() {
        // Initialize an empty list of coffee machines
        this.coffeMachines = new ArrayList<>();
    }

    // Method to inject coffee machines
    public void setCoffeMachines(List<CoffeMachine> coffeMachines) {
        this.coffeMachines = coffeMachines;
    }

    // Method to make coffee using all injected machines
    public void makeCoffe() {
        coffeMachines.forEach(cm -> cm.start());
    }
}
