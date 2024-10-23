import org.jetbrains.annotations.NotNull;

public class Truck extends Car implements Trailer {
    public Truck(@NotNull String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }
}
