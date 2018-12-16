package polymorphism;

public class Circle extends Figure {
    private float radius;
    private final float p = 3.1415f;

    public Circle(float x, float y, float radius){
        super(x, y);
        this.radius = radius;
    }
    @Override
    public float getPerimeter(){
        return (p*2)*radius;
    }

    @Override
    public float getArea(){
        return (radius * radius)*p;
    }

    @Override
    void draw(){
        System.out.println("Draw Circle");
    }
}
