package h3.task2;

class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
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
