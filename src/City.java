import java.util.ArrayList;

public class City {
    public String cityName;
    public double latitudeKord;
    public double longitudeKord;


    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public double getLatitudeKord() {
        return latitudeKord;
    }
    public void setLatitudeKord(double latitudeKord) {
        this.latitudeKord = latitudeKord;
    }
    public double getLongitudeKord() {
        return longitudeKord;
    }
    public void setLongitudeKord(double longitudeKord) {
        this.longitudeKord = longitudeKord;
    }

    public static void toString(City city) {
        System.out.println(city.getCityName() + " " + city.getLatitudeKord() + " " + city.getLongitudeKord());
    }

    public void addConnection(City cityToConnect) {
        if (this.equals(cityToConnect)) {
            System.out.println("Eine Stadt kann nicht mit sich selbst verkneupft werden.");
            return;
        }
    }

    public Route getRouteTo(City destination) {
        ArrayList<Route> allPossibleRoutes = new ArrayList<>();
        Route initialRoute = new Route();
        Route.addAllRoutes(allPossibleRoutes, initialRoute, this, destination, null);

        return Route.getShortestRoute(this, destination);
    }

    
    
}

