public abstract class AbstractGlue implements Glue{
    private String Name;
    glueType Type;
    Integer SizeInMillilitres;
    Boolean AdheresToPlastic;
    Boolean AdheresToWood;
    Boolean AdheresToMetal;
    Boolean AdheresToGlass;
    Boolean AdheresToPottery;
    Integer CuringTimeInMinutes;
    Double Price;

    Display Display;

    public AbstractGlue(Display display, String name, glueType type, int size, boolean adheresToPlastic, boolean adheresToWood, boolean adheresToMetal, boolean adheresToGlass, boolean adheresToPottery, int curingTime, double price) {
        Name = name;
        Type = type;
        SizeInMillilitres = size;
        AdheresToWood = adheresToWood;
        AdheresToMetal = adheresToMetal;
        AdheresToGlass = adheresToGlass;
        AdheresToPlastic = adheresToPlastic;
        AdheresToPottery = adheresToPottery;
        CuringTimeInMinutes = curingTime;
        Price = price;
        Display = display;
    }

    public void Show() {
        Display.PrintToScreen(Name,Type, SizeInMillilitres ,AdheresToPlastic,AdheresToWood,AdheresToMetal,AdheresToGlass,AdheresToPottery,CuringTimeInMinutes,Price);
    }

//    @Override
//    public void PrintToScreen(String name, String type, int size, boolean plastic, boolean wood, boolean metal, boolean glass, boolean pottery, int minutes, double price) {
//
//    }
}
enum glueType {
    Bottle,
    Metal,
    Tube,
}