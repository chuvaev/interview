import polymorphism.Circle;
import polymorphism.Figure;
import polymorphism.Rectangle;


public class Main {
    public static void main(String[] args){
        Person person = new Person.Builder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .middleName("Ivanovich")
                .country("Russia")
                .address("Ivanovskaya street 22")
                .phone("+78002008899")
                .age(55)
                .build();
        Person person1 = new Person.Builder()
                .firstName("John")
                .lastName("Bon Jovi")
                .country("USA")
                .phone("+13055666777")
                .age(40)
                .build();

        System.out.println(person);
        System.out.println(person1);

        Lorry lorry = new Lorry(new Engine("Engine"), "blue", "Volvo");
        Lorry lorry1 = new Lorry(new Engine ("SuperEngine"), "black", "Mercedes",150);
        LightWeightCar lightWeightCar = new LightWeightCar(new Engine("NewEngine"),"green","BMW");

        lorry.start();
        lorry.move();
        lorry.stop();
        lorry.open();

        lightWeightCar.start();
        lightWeightCar.move();
        lightWeightCar.stop();
        lightWeightCar.open();

        Figure circle = new Circle(10,10,5);
        System.out.println(((Circle) circle).getArea());

        Figure rectangle = new Rectangle(20,10,20,10);
        System.out.println(((Rectangle) rectangle).getArea());
    }
}
