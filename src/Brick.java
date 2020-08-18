public class Brick extends Obstacle {

    private int heigth = 5;

    public Brick(String name, int heigth) {
        super(name);
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean move (RunJump runJump) {

        runJump.jump();

        if (getHeigth() <= runJump.jumpHeight()) {
            System.out.println("Прыжок успешен");

            return true;
        } else {
            System.out.println("Прыжок не успешен");

            return false;
        }
    }

    @Override
    protected boolean moving(RunJump runJump) {
        return false;
    }

}
