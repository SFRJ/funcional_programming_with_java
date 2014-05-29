package templatemethodpattern.client;

import templatemethodpattern.CottonWash;
import templatemethodpattern.SilkWash;
import templatemethodpattern.WashinMashine;

public class Main {

    public static void main(String[] args) {
        /*
            When calling a template method:
            - use programming to the interface not to the implementation
            - keep the abstract methods protected and the abstract class in a separate package to make
            sure the client does not call on the individual methods(In case you want to allow access just
            to the template method)
        */
        WashinMashine cottonWash = new CottonWash();
        cottonWash.wash();
        System.out.println("---------------");
        WashinMashine silkWash = new SilkWash();
        silkWash.wash();
    }
}
