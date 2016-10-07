/**
 * Created by jc321258 on 12/09/16.
 */
public class DemoPoem {
    public static void main(String[] args) {
        Poem billAndAlice = new Poem("Bill and Alive",10);
        billAndAlice.display();
        Haiku beep = new Haiku("Beep");
        beep.display();
        Limerick boop = new Limerick("Boop");
        boop.display();
        Couplet baap = new Couplet("Baap");
        baap.display();
    }
}
