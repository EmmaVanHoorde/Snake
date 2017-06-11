
public class Game {

    Snake snake;
    Food food;
    Score score;
    Start start;
    String stage = start.getStage();


    public void update() {

        snake.move();
        Case getFood = food.getCase();

        if (snake.meet(getFood)) {
            snake.eating();

            Case newFood;
            do {
                newFood = food.newfood();
            }
            while (snake.meet(newFood));

            score.increaseScore();
        }
    }

    public void newGame() {
        score.resetScore();
        snake.createStartSnake();
    }


    public void addSnake(Snake snake) {

        this.snake = snake;
    }

    public void addfood(Food food) {

        this.food = food;
    }

    public void addScore(Score score) {

        this.score = score;
    }

    public Snake getSnake() {

        return snake;
    }

    public Score getScore() {
        return score;
    }

    public Food getfood() {

        return food;
    }

}
