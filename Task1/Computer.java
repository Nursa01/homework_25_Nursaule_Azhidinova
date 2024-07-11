package Task1;
public class Computer implements Switchable, Playable{
    @Override
    public void turnOff() {
        System.out.println("Computer turned off.");
    }

    @Override
    public void turnOn() {
        System.out.println("Computer turned on.");
    }

    @Override
    public void play() {
        System.out.println("Player is playing computer.");
    }

    @Override
    public void pause() {
        System.out.println("Game is paused.");
    }
}
