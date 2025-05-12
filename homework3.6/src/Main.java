import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Creăm câteva mașini de cafea
        CoffeMachine simpleMachine = new SimpleCoffeMachine();
        CoffeMachine complexMachine = new ComplexCoffeMachine();

        // Le injectăm într-un CoffeeLover
        CoffeLover coffeeLover = new CoffeLover(Arrays.asList(simpleMachine, complexMachine));

        // Facem cafea
        coffeeLover.makeCoffee();
    }
    }
