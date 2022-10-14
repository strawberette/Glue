public class Main {
    public static void main(String[] args) throws Throwable {
        Glue prittStick = new Strategy(new PrittStick(new StandardDisplay()));
        prittStick.ShowGlueName();
        System.out.println("-----------------------------------------------");
        prittStick.Show();

        Glue woodGlue = new Strategy(new WoodGlue(new StandardDisplay()));
        woodGlue.ShowGlueName();
        System.out.println("-----------------------------------------------");
        woodGlue.Show();

        Glue superGlue = new Strategy(new SuperGlue(new StandardDisplay()));
        superGlue.ShowGlueName();
        System.out.println("-----------------------------------------------");
        superGlue.Show();

//        FRENCH EDITION

        Glue prittStickFrench = new Strategy(new PrittStick(new FrenchDisplay()));
        prittStickFrench.Show();

        Glue woodGlueFrench = new Strategy(new WoodGlue(new FrenchDisplay()));
        woodGlueFrench.Show();

        Glue superGlueFrench = new Strategy(new SuperGlue(new FrenchDisplay()));
        superGlueFrench.Show();

//        ITALIAN EDITION

        Glue prittStickItalian = new Strategy(new PrittStick(new ItalianDisplay()));
        prittStickItalian.Show();

        Glue woodGlueItalian = new Strategy(new WoodGlue(new ItalianDisplay()));
        woodGlueItalian.Show();

        Glue superGlueItalian = new Strategy(new SuperGlue(new ItalianDisplay()));
        superGlueItalian.Show();

    }
}









// FACTORY PATTERN
//public class Main {
//    public static void main(String[] args) throws Throwable {
//        AbstractGlue PrittStick = new Factory().generate("PrittStick");
//        PrittStick.Show();
//    }
//}
