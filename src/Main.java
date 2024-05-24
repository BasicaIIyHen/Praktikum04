public class Main {
    public static void main(String[] args) throws Exception {
        

        City Ingolstadt = new City();
        Ingolstadt.setCityName("Ingolstadt");
        Ingolstadt.setLatitudeKord(48.764001378240835);
        Ingolstadt.setLongitudeKord(11.42625484665524);
        City.toString(Ingolstadt);

        City Munich = new City();
        Munich.setCityName("Munich");
        Munich.setLatitudeKord(48.13891855227781);
        Munich.setLongitudeKord(11.577266137987793);
        City.toString(Munich);

        City Nurberg = new City();
        Nurberg.setCityName("Nurberg");
        Nurberg.setLatitudeKord( 49.45061728516064);
        Nurberg.setLongitudeKord( 11.076253152617218);
        City.toString(Nurberg);

        City Ulm = new City();
        Ulm.setCityName("Ulm");
        Ulm.setLatitudeKord(48.40203485876449);
        Ulm.setLongitudeKord(9.976324958249457);
        City.toString(Ulm);

        City Stuttgart = new City();
        Stuttgart.setCityName("Stuttgart");
        Stuttgart.setLatitudeKord(48.77593813959718);
        Stuttgart.setLongitudeKord(9.17688481609677);
        City.toString(Stuttgart);

        City Augsburg = new City();
        Augsburg.setCityName("Augsburg");
        Augsburg.setLatitudeKord(48.3684765834842);
        Augsburg.setLongitudeKord(10.89671693335146);
        City.toString(Augsburg);

        City Regensburg = new City();
        Regensburg.setCityName("Regensburg");
        Regensburg.setLatitudeKord(49.01662121288669);
        Regensburg.setLongitudeKord(12.092787603517024);
        City.toString(Regensburg);

        City Wurzburg = new City();
        Wurzburg.setCityName("Wurzburg");
        Wurzburg.setLatitudeKord( 49.79296114327296);
        Wurzburg.setLongitudeKord( 9.945390533206055);
        City.toString(Wurzburg);
    }
}
