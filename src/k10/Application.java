package k10;

public class Application {
    public static void main(String... args) {
        IMicrowaveUnit unitM1 = new M1();
        Microwave microwave1 = new Microwave(unitM1);
        System.out.println(microwave1);

        microwave1.pressButton();
        System.out.println(microwave1);

        microwave1.pressButton();
        System.out.println(microwave1);

        System.out.println();

        IMicrowaveUnit unitM2 = new M2();
        Microwave microwave2 = new Microwave(unitM2);
        System.out.println(microwave2);

        microwave2.pressButton();
        System.out.println(microwave2);

        microwave2.pressButton();
        System.out.println(microwave2);
    }
}
