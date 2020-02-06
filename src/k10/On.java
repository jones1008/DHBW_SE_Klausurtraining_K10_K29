package k10;

public class On implements ISwitchState {
    public void pressButton(Microwave microwave) {
        microwave.setState(new Off());
    }

    public String toString() {
        return "On";
    }
}
