package h2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(50,50.5);
        System.out.println(b1);
        b1.move(-10, 0.5);
        System.out.println(b1);
    }
}
