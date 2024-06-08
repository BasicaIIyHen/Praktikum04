import java.util.ArrayList;

public class Route {
    private ArrayList<City> routeCities;
    private double totalDistance;

    public Route() {
        this.routeCities = new ArrayList<>();
        this.totalDistance = 0;
    }

    public Route(Route route) {
        this.routeCities = new ArrayList<>(route.routeCities);
        this.totalDistance = route.totalDistance;
    }
}
