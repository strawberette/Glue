public class ItalianDisplay implements Display {

    public void PrintToScreen(String name, glueType type, int size, boolean plastic, boolean wood, boolean metal, boolean glass, boolean pottery, int minutes, double price) {
        System.out.println("Nome della colla: " + name);
        System.out.println("Tipo di colla: " + GlueTypeToItalian(type));
        System.out.println("Misura: " + size);
        System.out.println("Adatta per la plastica: " + BoolToItalian(plastic));
        System.out.println("Adatta per il legno: " + BoolToItalian(wood));
        System.out.println("Adatta per il metallo: " + BoolToItalian(metal));
        System.out.println("Adatta per il vetro: " + BoolToItalian(glass));
        System.out.println("Adatta per la ceramica: " + BoolToItalian(pottery));
        System.out.println("Tempo di essiccazione: " + minutes + " minuti");
        System.out.println("Prezzo: $" + price);
        System.out.println("\n");
        System.out.println("-----------------------------------------------");
        System.out.println("\n");
    }

    private String BoolToItalian(boolean value){
        if(value == true){
            return "vero";
        }
        return "falso";
    }
    private String GlueTypeToItalian(glueType value){
        if (value == glueType.Bottle) {
            return "Flacone";
        }

        if (value == glueType.Metal) {
            return "Metallo";
        }

        return "Tubetto";
    }
}
