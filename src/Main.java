/*
1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать
 (методы просто выводят информацию о действии в консоль).

2.Создайте два класса: беговая дорожка(Trail) и стена(Brick), при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
 */

public class Main {

    public static void main(String[] args) {


        RunJump[] run = {
                new Cat("Кот", 5, 10),
                new Human("Человек", 4, 7),
                new Robot("Робот", 34, 33)
        };

        for(RunJump rrr : run){
            rrr.run();
        }

        for(RunJump jjj : run){
            jjj.jump();
        }


        /*
        RunJump[] runJump = new RunJump[3];
        int distance = 5;
        int jump = 2;

        runJump[0] = new Human("Человек", distance, jump);

        distance = 6;
        jump = 3;
        runJump[1] = new Cat("Кот", distance, jump);

        distance = 7;
        jump = 4;
        runJump[2] = new Robot("Робот", distance, jump);

        Obstacle[] obstacle = new Obstacle[5];

        // ?????????
        boolean Move = false; //????
        for (int i = 0; i < obstacle.length; i++) {
            if(Move){
                obstacle[i] = new Trail("Дорожка" + i, distance);
            }else{
                obstacle[i] = new Brick("Стена" + i, distance);
            }
        }

        for (int i = 0; i < runJump.length; i++) {
            boolean result;
            for (int j = 0; j < obstacle.length; j++) {
                result = obstacle[j].move(runJump[i]);
                if (!result){
                    break;
                }
            }
            
        }

         */





        /*
        Cat cat = new Cat("Кот");
        Human human = new Human("Человек");
        Robot robot = new Robot("Робот");


        /*Либо массив
        Run[] run = {
        new cat("Кот"),
        new human("Человек"),
        new robot("Робот")
        };

        for(Run rrr : run){
        rrr.run();
        }

         */

         /*
        cat.run();
        cat.jump();

        human.run();
        human.jump();

        robot.run();
        robot.jump();
        */


    }
}





