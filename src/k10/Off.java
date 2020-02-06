package k10;

public class Off implements ISwitchState {
    public void pressButton(Microwave microwave) {
        microwave.setState(new On());
    }

    public String toString() {
        return "Off";
    }
}
