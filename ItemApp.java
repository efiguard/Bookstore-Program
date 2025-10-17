package item;

public class ItemApp {
    public static void main(String[] args) {
        Item[] obj = new Item[5];
        obj[0] = new Item("1", "Morrowind", 200.0, 5);
        obj[1] = new Item("2", "Daggerfall", 320.0, 13);
        obj[2] = new Item("3", "Skyrim", 150.0, 8);
        obj[3] = new Item("4", "Oblivion", 220.0, 3);
        obj[4] = new Item("5", "Vvardenfell", 333.0, 7);
        
        System.out.println("Report:\n");
        for(int i = 0; i < obj.length; i++){
            System.out.println(obj[i]);
        }
        System.out.println("\nThese are all the books we have in stock along with their code, name, price and quantity.");
        
    }
}

