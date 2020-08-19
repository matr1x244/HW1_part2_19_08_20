public class Road extends Barrier {

    private int length; // длинна

    public Road(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() { // геттер верни длину
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Беговая дорожка" + getName() + " длинна: " + length);

        actions.run(); // запуск бега

        if (getLength() <= actions.getRunDistance()) { // если длина дорожки меньше пробежки персонажа то он пробежал
            System.out.println("Пробежал успешно");

            return true;
        } else {
            System.out.println("Не смог пробежать"); // если лож то он не пробежал

            return false;
        }
    }
}