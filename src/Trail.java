public class Trail extends Obstacle {

    private int length = 10;

    public Trail(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean move (RunJump runJump) {

        runJump.run();

        if (getLength() <= runJump.runDist()) {
            System.out.println("Бег успешно");
            return true;
        } else {
            System.out.println("Бег не успешно");
            return false;
        }
    }

    @Override
    protected boolean moving(RunJump runJump) {
        return false;
    }
}
