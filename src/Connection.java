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

    private double degreesToRadians(double degrees) {
        return degrees * Math.PI / 180;
    }

    public String getOtherCity(String   )   /*Schreiben Sie in der Klasse Connection eine Methode namens getOtherCity, welche einen Eingabeparameter namens
    City erwartet. Als Rückgabewert wird ebenfalls eine City erwartet. Nehmen wir an die Verbindung hat die Stadt
    Ingolstadt und die Stadt München hinterlegt, und der Eingabeparameter ist die Stadt Ingolstadt, so muss die Stadt
    München zurückgegeben werden.*/
}
