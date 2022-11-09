package behavioral.command;

public class TurnVolumeUp implements Command{

    ElectronicDevice device;

    public TurnVolumeUp(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }
    
}
