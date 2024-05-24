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
    
}

