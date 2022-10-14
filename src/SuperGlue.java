
public class SuperGlue extends AbstractGlue {
    public SuperGlue(Display display) {
        super( display,  "SuperGlue", glueType.Metal, 100, true, false, false, true, true, 3, 5.50 );
    }

    public void ShowGlueName() {
        System.out.println("Hi there, I am the fabulous SuperGlue");
    }
}


//public class SuperGlue implements Glue {
//    public String getName() {
//        return "SuperGlue";
//    }
//    public glueType getType() {
//        return glueType.Metal;
//    }
//    public Integer getSizeInMillilitres() {
//        return 100;
//    }
//    public Boolean AdheresToPlastic() {
//        return true;
//    }
//    public Boolean AdheresToWood() {
//        return false;
//    }
//    public Boolean AdheresToMetal() {
//        return false;
//    }
//    public Boolean AdheresToGlass() {
//        return true;
//    }
//    public Boolean AdheresToPottery() {
//        return true;
//    }
//    public Integer getCuringTimeInMinutes() {
//        return 3;
//    }
//    public Double getPrice() {
//        return 5.50;
//    }
//
//}
