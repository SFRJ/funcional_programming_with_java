package templatemethodpattern;

public class SilkWash extends WashinMashine{
    @Override
    public void powder() {
        System.out.println("Adding 1/2 cup of washing powder");
    }

    @Override
    public void temperature() {
        System.out.println("Setting temperature at 40 degrees");
    }

    @Override
    public void time() {
        System.out.println("Time is set to 1/2 hour");
    }

    @Override
    public void extras() {
        System.out.println("No extras in this wash");
    }
}
