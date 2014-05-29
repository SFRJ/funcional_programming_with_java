package highorderfunctions;

public class Beast {

    public void doSomething() {
        act(new Action() {
            @Override
            public String perform() {
                return "the beast crawls";
            }
        });
    }

    private void act(Action action) {
        System.out.println(action.perform());
    }
}
