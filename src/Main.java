/*
1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать
 (методы просто выводят информацию о действии в консоль).

2.Создайте два класса: беговая дорожка(Trail) и стена(Brick), при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
 */

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int distance = 10; // длинна бега персонажей
        int heigth = 5; // высота прыжка персонажей

        int distanceRoad = 15; // длинна беговой дорожки
        int heigthJump = 10; // высота стены

        Actions[] actions = new Actions[3]; // массив персонажей

        actions[0] = new People("", distance, heigth);
        actions[1] = new Robot("", distance, heigth);
        actions[2] = new Cat("", distance, heigth);

        Barrier[] barriers = new Barrier[2]; // кол-во препятствий (массив) // ТУТ ЕСТЬ вопрос если место [2] будет [1] - тогда Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
        barriers[0] = new Wall("Стена", heigth);
        barriers[1] = new Road("Беговая дорожка", distance);

        for (int i = 0; i < barriers.length; i++) { // проверка массива
            for (int j = 0; j < barriers.length; j++) {

                distance = distanceRoad; // длинна беговой дорожки
                heigth = heigthJump; // высота стены

                if (distance <= distanceRoad) { // тут создаем стену и дорожку при проверке массива с результатом если (дистанция меньше или равна длинне дорожки) то создай стену
                        barriers[j] = new Wall("", heigth);
                    if(heigth <= heigthJump){
                        barriers[i] = new Road("", distance);
                    }
                }
            }
        }
            for (int i = 0; i < actions.length; i++) {
                for (int j = 0; j < barriers.length; j++) {
                    barriers[j].moving(actions[i]); // тут помог наставник... :( Есть вопрос по поводу этого где можно почитать? более подробно принцип работы
                    System.out.println("------------");
                    }
                }
            }
        }






