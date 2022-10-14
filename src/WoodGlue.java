public class WoodGlue extends AbstractGlue {
    public WoodGlue(Display display) {

    super(display,"WoodGlue", glueType.Bottle,150,false,true,false,false,false,4,5.00);
}
    public void ShowGlueName() {
        System.out.println("Hello, I am WoodGlue, as useless as it sounds");
    }
}


//public class WoodGlue implements Glue {
//    public String getName() {
//        return "WoodGlue";
//    }
//    public glueType getType() {
//        return glueType.Bottle;
//    }
//    public Integer getSizeInMillilitres() {
//        return 150;
//    }
//    public Boolean AdheresToPlastic() {
//        return false;
//    }
//    public Boolean AdheresToWood() {
//        return true;
//    }
//    public Boolean AdheresToMetal() {
//        return false;
//    }
//    public Boolean AdheresToGlass() {
//        return false;
//    }
//    public Boolean AdheresToPottery() {
//        return false;
//    }
//    public Integer getCuringTimeInMinutes() {
//        return 4;
//    }
//    public Double getPrice() {
//        return 5.00;
//    }
//
//}
