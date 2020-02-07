package k10;

public class Off implements ISwitchState {
    public void pressButton(Microwave microwave) {
        microwave.setState(new On());
    }

    @Override
    public String toString() {
        return "Off";
    }
}
