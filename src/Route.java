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
        
        if (connection.getDistance() != 0){
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

}
