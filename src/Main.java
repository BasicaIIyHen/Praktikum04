public class Main {
    public static void main(String[] args) throws Exception {
        

        City ingolstadt = new City();
        ingolstadt.setCityName("Ingolstadt");
        ingolstadt.setLatitudeKord(48.764001378240835);
        ingolstadt.setLongitudeKord(11.42625484665524);
        City.toString(ingolstadt);

        City munich = new City();
        munich.setCityName("Munich");
        munich.setLatitudeKord(48.13891855227781);
        munich.setLongitudeKord(11.577266137987793);
        City.toString(munich);

        City nurberg = new City();
        nurberg.setCityName("Nurberg");
        nurberg.setLatitudeKord( 49.45061728516064);
        nurberg.setLongitudeKord( 11.076253152617218);
        City.toString(nurberg);

        City ulm = new City();
        ulm.setCityName("Ulm");
        ulm.setLatitudeKord(48.40203485876449);
        ulm.setLongitudeKord(9.976324958249457);
        City.toString(ulm);

        City stuttgart = new City();
        stuttgart.setCityName("Stuttgart");
        stuttgart.setLatitudeKord(48.77593813959718);
        stuttgart.setLongitudeKord(9.17688481609677);
        City.toString(stuttgart);

        City augsburg = new City();
        augsburg.setCityName("Augsburg");
        augsburg.setLatitudeKord(48.3684765834842);
        augsburg.setLongitudeKord(10.89671693335146);
        City.toString(augsburg);

        City regensburg = new City();
        regensburg.setCityName("Regensburg");
        regensburg.setLatitudeKord(49.01662121288669);
        regensburg.setLongitudeKord(12.092787603517024);
        City.toString(regensburg);

        City wurzburg = new City();
        wurzburg.setCityName("Wurzburg");
        wurzburg.setLatitudeKord( 49.79296114327296);
        wurzburg.setLongitudeKord( 9.945390533206055);
        City.toString(wurzburg);

        //Direkte VErbindungen

        ingolstadt.addConnection(munich);
        ingolstadt.addConnection(nurberg);
        ingolstadt.addConnection(regensburg);
        ingolstadt.addConnection(augsburg);

        munich.addConnection(augsburg);
        
        ulm.addConnection(augsburg);

        stuttgart.addConnection(ulm);
        stuttgart.addConnection(nurberg);
        stuttgart.addConnection(wurzburg);

        regensburg.addConnection(munich);
        regensburg.addConnection(nurberg);
        
        nurberg.addConnection(ulm);
    }

    
}

