public class Main {
    public static void main(String[] args) throws Exception {
        

        //Initialize cities
        City ingolstadt = new City("Ingolstadt", 48.764001378240835, 11.42625484665524);
        City muenchen = new City("Muenchen", 48.13891855227781, 11.577266137987793);
        City nuernberg = new City("Nuernberg", 49.45061728516064, 11.076253152617218);
        City ulm = new City("Ulm", 48.40203485876449, 9.976324958249457);
        City stuttgart = new City("Stuttgart", 48.77593813959718, 9.17688481609677);
        City augsburg = new City("Augsburg", 48.3684765834842, 10.89671693335146);
        City regensburg = new City("Regensburg", 49.01662121288669, 12.092787603517024);
        City wuerzburg = new City("Wuerzburg", 49.79296114327296, 9.945390533206055);

        // Print the cities
        System.out.println(ingolstadt);
        System.out.println(muenchen);
        System.out.println(nuernberg);
        System.out.println(ulm);
        System.out.println(stuttgart);
        System.out.println(augsburg);
        System.out.println(regensburg);
        System.out.println(wuerzburg);
        
        //create connections
        ingolstadt.addConnection(muenchen);
        ingolstadt.addConnection(nuernberg);
        ingolstadt.addConnection(regensburg);
        ingolstadt.addConnection(augsburg);
        muenchen.addConnection(augsburg);
        ulm.addConnection(augsburg);
        stuttgart.addConnection(ulm);
        stuttgart.addConnection(nuernberg);
        stuttgart.addConnection(wuerzburg);
        regensburg.addConnection(muenchen);
        regensburg.addConnection(nuernberg);
        nuernberg.addConnection(ulm);
    }
}

