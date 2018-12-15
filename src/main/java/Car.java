
abstract class Car {
    private Engine engine;
    private String color;
    private String name;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(Engine engine, String color, String name){
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    public void move(){
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stop");
    }

    public void start(){
        System.out.println("Car starting");
    }

    abstract void open();

}

class LightWeightCar extends Car {

    @Override
    void open() {
        System.out.println("LightWeightCar is open");
    }

    public LightWeightCar(Engine engine, String color, String name){
        super(engine, color, name);
    }
}

class Lorry extends Car {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    void open() {
        System.out.println("Lorry Car is open");
    }


    public Lorry (Engine engine, String color, String name){
        super(engine, color, name);
    }

    public Lorry (Engine engine, String color, String name, int speed){
        super(engine, color, name);
        this.speed = speed;
    }

}

class Engine{
    private String name = "Engine";

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public Engine(String name){
        this.name = name;
    }
}

