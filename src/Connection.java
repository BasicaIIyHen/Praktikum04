public class Connection {
    
    double getDistanceInKm (City city1, City city2) {

        
        double lat1 = city1.getLatitudeKord();
        double lon1 = city1.getLongitudeKord();


        double lat2 = city2.getLatitudeKord();
        double lon2 = city2.getLongitudeKord();


        double earthRadiusKm = 6371;
        double dLat = degreesToRadians(lat2-lat1);
        double dLon = degreesToRadians(lon2-lon1);


        lat1 = degreesToRadians(lat1);
        lat2 = degreesToRadians(lat2);


        double a = Math.sin(dLat/2) * Math.sin(dLat/2) + Math.sin(dLon/2) * Math.sin(dLon/2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));


        return earthRadiusKm * c;
    }

    // Umrechnung von Deg in Rad
    private double degreesToRadians(double degrees) {
        return degrees * Math.PI / 180;
    }

    /*public City getOtherCity(City city) {
        if (city.equals(city1)) {
            return city2;
        } else {
            return city1;
        }
    }*/
}
