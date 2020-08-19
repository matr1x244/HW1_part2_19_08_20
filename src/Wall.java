public class Wall extends Barrier {

    private int heigth; // высота

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() { // геттер верни высоту
        return heigth;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Стена " + getName() + "высота: " + heigth);

        actions.jump(); // запуск прыжка

        if (getHeigth() <= actions.getJumpHeight()) { // если высота стены меньше высоты прыжка персонажа то он перепрыгнул
            System.out.println("Перепрыгнул стену");
            return true;

        } else {
            System.out.println("Не перепрыгнул стену"); // если нет, тогда не перепрыгнул

            return false;
        }
    }
}