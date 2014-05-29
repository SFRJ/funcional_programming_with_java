package templatemethodpattern;

public class CottonWash extends WashinMashine{
    @Override
    public void powder() {
        System.out.println("Adding 1 cup of washing powder");
    }

    @Override
    public void temperature() {
        System.out.println("Setting temperature at 60 degrees");
    }

    @Override
    public void time() {
        System.out.println("Time is set to 1 hour");
    }

    @Override
    public void extras() {
        System.out.println("Including extra softener");
    }
}
