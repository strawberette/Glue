

public class StandardDisplay implements Display {
        public void PrintToScreen(String name, glueType type, int size, boolean plastic, boolean wood, boolean metal, boolean glass, boolean pottery, int minutes, double price) {
                System.out.println("Glue name: " + name);
                System.out.println("Glue type: " + type);
                System.out.println("Glue size: " + size);
                System.out.println("Adheres to plastic: " + plastic);
                System.out.println("Adheres to wood: " + wood);
                System.out.println("Adheres to metal: " + metal);
                System.out.println("Adheres to glass: " + glass);
                System.out.println("Adheres to pottery: " + pottery);
                System.out.println("Curing time: " + minutes + " minutes");
                System.out.println("Price: $" + price);
                System.out.println("\n");
                System.out.println("-----------------------------------------------");
                System.out.println("\n");

        }
}