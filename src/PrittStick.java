public class PrittStick extends AbstractGlue {
    public PrittStick(Display display) {
        super(display, "PrittStick", glueType.Tube, 120, false, false, false, false, false, 5, 3.50);
    }

    public void ShowGlueName() {
        System.out.println("Hello, I am pretty and PrittStick");
    }
}
