public class Cat implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Барсик " + name + " пробежал: " + getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Барсик " + name + " прыгнул: " + getJumpHeight());
    }

    @Override
    public int getRunDistance() { // верни сколько пробежал
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() { // верни сколько прыгнул
        return this.jumpHeight;
    }
}