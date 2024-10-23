import org.jetbrains.annotations.NotNull;

public class ServiceStation {
    public void check(@NotNull WheeledVehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        vehicle.check();
    }
}
