package Task1;

public class Main {
    public static void main(String[] args) {
        Watchable watch;
        Playable play;
        Refregerator refregerator;

        watch  = new Television();
        play = new Computer();
        refregerator = new Fridge();

        watch.changeChannel();
        watch.listen();

        play.play();
        play.pause();

        refregerator.openDoor();
        refregerator.closeDoor();
        refregerator.defrost();

        turnOn(new Computer(), new Television(), new Fridge());
        turnOff(new Computer(), new Television(), new Fridge());
    }
    public static void turnOn(Switchable... params) {
        for(Switchable that : params){
            that.turnOn();
        }
    }
    public static void turnOff(Switchable... params) {
        for(Switchable that : params){
            that.turnOff();
        }
    }
}
