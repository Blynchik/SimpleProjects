package Tetris;

public class Tetris {
    private Field field;
    private Figure figure;

    static Tetris game;

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }

    void step() {

    }

    void run() {

    }

    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }
}
