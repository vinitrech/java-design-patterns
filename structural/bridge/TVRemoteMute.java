package structural.bridge;

public class TVRemoteMute extends RemoteButton{

    public TVRemoteMute(EntertainmentDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was muted");
    }
    
}
