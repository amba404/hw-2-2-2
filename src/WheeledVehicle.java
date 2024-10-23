import org.jetbrains.annotations.NotNull;

public abstract class WheeledVehicle {
    private final String modelName;
    private final int wheelsCount;

    public WheeledVehicle(@NotNull String modelName, int wheelsCount) {
        if (modelName.isBlank()) throw new IllegalArgumentException("Неверное имя");
        this.modelName = modelName;
        if (wheelsCount < 1) throw new IllegalArgumentException("Неверное число колёс");
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyres() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void check() {
        updateTyres();
    }
}
