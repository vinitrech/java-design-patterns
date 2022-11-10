package structural.bridge;

public class TVRemotePause extends RemoteButton{

    public TVRemotePause(EntertainmentDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was paused");
    }
    
}
