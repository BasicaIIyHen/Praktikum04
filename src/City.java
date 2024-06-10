import java.util.ArrayList;

public class City {
    private String cityName;
    private double latitudeKord;
    private double longitudeKord;
    private ArrayList<Connection> connections; 

    

    public City(String cityName, double latitudeKord, double longitudeKord) {
        this.cityName = cityName;
        this.latitudeKord = latitudeKord;
        this.longitudeKord = longitudeKord;
        this.connections = new ArrayList<Connection>();
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Connection> getConnections(){
        return connections;
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

    public String toString(City city) {
        return (city.getCityName() + " " + city.getLatitudeKord() + " " + city.getLongitudeKord());
    }

    public void addConnection(City cityToConnect) {
        if (this.equals(cityToConnect)) {
            System.out.println("Eine Stadt kann nicht mit sich selbst verkneupft werden.");
            return;
        }
        Connection con = new Connection(this, cityToConnect);

        if (!connections.contains(con)){
            this.connections.add(con);
            cityToConnect.connections.add(con);
        }
       
    }
   
    public Route getRouteTo(City destination){
        return Route.getShortestRoute(this, destination);
    }

    public String toString(){
        return cityName + " - " + " Latitude Coordinate: " + latitudeKord + " Longtitude Coordinate: " + longitudeKord;
    }
}

