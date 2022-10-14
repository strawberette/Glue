public class Factory {
    public static AbstractGlue generate(String glueName) throws Throwable {
        if (glueName == "SuperGlue") {
            return new SuperGlue(new StandardDisplay());
        }
        if (glueName == "WoodGlue") {
            return new WoodGlue(new StandardDisplay());
        }
        if (glueName == "PrittStick") {
            return new PrittStick(new StandardDisplay());
        }
        throw new Exception("I am sorry, this is not a valid glue type.");
    }
}
