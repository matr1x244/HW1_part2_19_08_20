public class Human implements RunJump {

    private String name;
    private int runDistan;
    private int jumpHeight;

    public Human(String name, int runDistan, int jumpHeight) {
        this.name = name;
        this.runDistan = runDistan;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump() {
        System.out.println("Персонаж: " + name + " - прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Персонаж: " + name + " - пробежал");
    }

    @Override
    public int runDist() {
        return 0;
    }

    @Override
    public int jumpHeight() {
        return 0;
    }
}

