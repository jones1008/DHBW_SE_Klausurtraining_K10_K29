package k10;

public class Microwave {
    private IMicrowaveUnit unit;
    private ISwitchState state;

    public Microwave(IMicrowaveUnit unit) {
        this.state = new Off();
        this.unit = unit;
    }

    public void setState(ISwitchState state) {
        this.state = state;
    }

    public ISwitchState getState() {
        return state;
    }

    public void pressButton() {
        state.pressButton(this);
    }

    public String toString() {
        return "MicrowaveUnit: " + unit + ", state: " + state;
    }
}
