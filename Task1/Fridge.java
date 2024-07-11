package Task1;
public class Fridge implements Switchable, Refregerator{

    @Override
    public void turnOff() {
        System.out.println("Fridge turned off.");
    }

    @Override
    public void turnOn() {
        System.out.println("Fridge turned on.");
    }

    @Override
    public void defrost() {
        System.out.println("Fridge defrosted.");
    }

    @Override
    public void openDoor() {
        System.out.println("Fridge opened door.");
    }

    @Override
    public void closeDoor() {
        System.out.println("Fridge closed door.");
    }
}
