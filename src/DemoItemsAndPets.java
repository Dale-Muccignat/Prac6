/**
 * Created by jc321258 on 12/09/16.
 */
public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold box = new ItemSold(1,"A box",50.00);
        box.display();
        ItemSold can = new ItemSold(2,"A can",25.00);
        can.display();
        PetSold bob = new PetSold(3,"A cat named bob",200.00,true,false,false);
        bob.display();
        PetSold bill = new PetSold(4,"A dog named bill",300.00,false,true,true);
        bill.display();

    }



}
