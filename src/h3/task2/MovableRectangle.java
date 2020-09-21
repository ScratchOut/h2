package h3.task2;

class MovableRectangle extends MovablePoint{
    public MovablePoint topLeft;
    public MovablePoint bottomRight;
    public int x1;
    public int y1;

    public MovableRectangle(int x1, int y1, int xSpeed, int ySpeed, int x, int y){
        super(x, y, xSpeed, ySpeed);
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                ", x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }

    @Override
    public void moveUp(){
        super.moveUp();
    }
    @Override
    public void moveDown(){
        super.moveDown();
    }
    @Override
    public void moveLeft(){
        super.moveLeft();
    }
    @Override
    public void moveRight(){
        super.moveRight();
    }
}
