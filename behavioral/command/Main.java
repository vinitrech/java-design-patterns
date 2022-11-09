package behavioral.command;

/* ***************************** Command design pattern *****************************
 * Turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request's execution, and support undoable operations.
 * 
 * PROS:
 * - Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform these operations.
 * - Open/Closed Principle. You can introduce new commands into the app without breaking existing client code.
 * - You can implement undo/redo.
 * - You can implement deferred execution of operations.
 * - You can assemble a set of simple commands into a complex one.
 * 
 * CONS: 
 * - The code may become more complicated since you’re introducing a whole new layer between senders and receivers.
 */

public class Main {
    public static void main(String[] args) {
        ElectronicDevice tv = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(tv);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        TurnTVOff offCommand = new TurnTVOff(tv);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        TurnVolumeUp volumeUp = new TurnVolumeUp(tv);
        onPressed = new DeviceButton(volumeUp);
        onPressed.press();

        TurnVolumeDown volumeDown = new TurnVolumeDown(tv);
        onPressed = new DeviceButton(volumeDown);
        onPressed.press();
    }
}
