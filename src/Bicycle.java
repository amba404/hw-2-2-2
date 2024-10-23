import org.jetbrains.annotations.NotNull;

public class Bicycle extends WheeledVehicle {
    public Bicycle(@NotNull String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велика");
    }
}
