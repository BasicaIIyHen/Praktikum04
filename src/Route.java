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

    private void appendCity(City city, Connection connection){
        if (!containsCity(city)){
            routeCities.add(city);
        } else return;
        
        if (connection != null){
            totalDistance += connection.getDistance();
        }
    }

    private boolean containsCity (City city){
        return routeCities.contains(city);
    }

    public String toString(){
        String output = new String();
        for (int i = 0; i < routeCities.size(); i++){
            output += routeCities.get(i).getCityName();
            
            if (i != routeCities.size()-1){
                output += " - ";
            }
        }
        output += "; Distance: " + totalDistance;

        return output;
    }

    public static Route getShortestRoute(City origin, City destination){
        Route emptyRoute = new Route();
        ArrayList<Route> allPossibleRoutes = new ArrayList<>();
        addAllRoutes(allPossibleRoutes, emptyRoute, origin, destination, null);
        ArrayList<Route> routesOrderedByDistance = new ArrayList<>();
        
        if (allPossibleRoutes.isEmpty()){
            return null;
        }

        for (Route currentRoute: allPossibleRoutes){

            if (routesOrderedByDistance.isEmpty()){
                routesOrderedByDistance.add(currentRoute);
                continue;
            }

            for (int i = 0; i < routesOrderedByDistance.size(); i++){
                if (currentRoute.totalDistance < routesOrderedByDistance.get(i).totalDistance){
                    routesOrderedByDistance.add(i, currentRoute);
                    break;
                }
            }
        }
        for (Route route: routesOrderedByDistance){
            System.out.println(route.toString());
        }
        return routesOrderedByDistance.get(0);
    }

    private static void addAllRoutes(ArrayList<Route> allPossibleRoutes, Route currentRoute, City currentCity, City destination, Connection connection){
        currentRoute.appendCity(currentCity, connection);

        if (currentCity.equals(destination)){
            allPossibleRoutes.add(currentRoute);
            return;
        }

        ArrayList<Connection> possibleNextCities = currentCity.getConnections();

        for(Connection currentConnection: possibleNextCities){
            City otherCity = currentConnection.getOtherCity(currentCity);
            if (!currentRoute.containsCity(otherCity)){
                Route continuedRoute = new Route(currentRoute);
                addAllRoutes(allPossibleRoutes, continuedRoute, otherCity, destination, currentConnection);
            }
        }
    }
}
