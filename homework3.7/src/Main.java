import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create coffee machines
        CoffeMachine simpleMachine = new SimpleCoffeMachine();
        CoffeMachine complexMachine = new ComplexCoffeMachine();

        // Create a CoffeLover object
        CoffeLover coffeLover = new CoffeLover();

        // Inject coffee machines via the setter
        List<CoffeMachine> machines = new ArrayList<>();
        machines.add(simpleMachine);
        machines.add(complexMachine);
        coffeLover.setCoffeMachines(machines);

        // Make coffee using the injected machines
        coffeLover.makeCoffe();
    }
}