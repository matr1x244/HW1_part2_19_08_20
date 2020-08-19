public class People implements Actions {
    private String name; // имя
    private int runDistance; // дистанция которую побежит
    private int jumpHeight; // прыжок высота

    public People(String name, int distance, int jumpHeight) { // конструктор
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Василий " + name + " пробежал: " + getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Василий" + name + " прыгнул: " + getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }


}