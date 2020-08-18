
public abstract class Obstacle {

    private String name;

    public Obstacle(String name) {
        this.name = name;
    }

    protected abstract boolean move (RunJump runjump);

    public String getName() {
        return name;
    }

    protected abstract boolean moving(RunJump runJump);
}
