import java.util.Arrays;
import java.util.List;

public class CoffeLover {
    private List<CoffeMachine> coffeeMachines; // Lista de mașini de cafea

    // Constructor care primește o listă de mașini de cafea injectată din exterior
    public CoffeLover(List<CoffeMachine> coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }

    // Metoda care pornește toate mașinile de cafea
    public void makeCoffee() {
        // Iterăm prin fiecare mașină de cafea și o pornim
        coffeeMachines.forEach(cm -> cm.start());
    }
}
