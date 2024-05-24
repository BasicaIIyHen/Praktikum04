public class Connection {
    
    double getDistanceInKm (City city1, City city2) {
        double lat1 = city1.getLatitudeKord();
        double lon1 = city1.getLongitudeKord();
        double lat2 = city2.getLatitudeKord();
        double lon2 = city2.getLongitudeKord();
        double R = 6371;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c;
        return distance;
    }
}
