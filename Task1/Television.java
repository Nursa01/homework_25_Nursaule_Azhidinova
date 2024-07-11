package Task1;
public class Television implements Switchable, Watchable{
    @Override
    public void turnOff() {
        System.out.println("Television off.");
    }

    @Override
    public void turnOn() {
        System.out.println("Television on.");
    }

    @Override
    public void watch() {
        System.out.println("Watch TV.");
    }

    @Override
    public void listen() {
        System.out.println("Listen the music from TV channels.");
    }

    @Override
    public void changeChannel() {
        System.out.println("Change channel on TV.");
    }
}
