import org.jetbrains.annotations.NotNull;

public class Car extends WheeledVehicle implements Engine {
    public Car(@NotNull String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}
