package polymorphism;

public abstract class Figure {
    private float x;
    private float y;

    Figure(float x, float y){
        this.x = x;
        this.y = y;
    }

    abstract float getPerimeter();
    abstract float getArea();
    abstract void draw();
}

