package highorderfunctions;

public class Human {

    public void doSomething() {
        act(new Action() {
            @Override
            public String perform() {
                return "the human walks";
            }
        });
    }

    private void act(Action action) {
        System.out.println(action.perform());
    }
}
