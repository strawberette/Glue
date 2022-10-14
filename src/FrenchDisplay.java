public class FrenchDisplay implements Display {
    public void PrintToScreen(String name, glueType type, int size, boolean plastic, boolean wood, boolean metal, boolean glass, boolean pottery, int minutes, double price) {
        System.out.println("Nom de la colle: " + name);
        System.out.println("Type de colle: " + GlueTypeToFrench(type));
        System.out.println("Taille: " + size);
        System.out.println("Colle pour la plastique: " + BoolToFrench(plastic));
        System.out.println("Colle pour le bois: " + BoolToFrench(wood));
        System.out.println("Colle pour le metal: " + BoolToFrench(metal));
        System.out.println("Colle pour le vitre: " + BoolToFrench(glass));
        System.out.println("Colle pour la poterie: " + BoolToFrench(pottery));
        System.out.println("Temps de durcissement: " + minutes + " minutes");
        System.out.println("Prix: $" + price);
        System.out.println("\n");
        System.out.println("-----------------------------------------------");
        System.out.println("\n");
    }

    private String BoolToFrench(boolean value){
        if(value == true){
            return "vrai";
        }
        return "faux";
    }


    private String GlueTypeToFrench(glueType value){
        if (value == glueType.Bottle) {
            return "Bouteille";
        }

        if (value == glueType.Metal) {
            return "Metal";
        }

        return "Tube";
    }
}
