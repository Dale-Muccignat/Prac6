/**
 * Created by jc321258 on 12/09/16.
 */
public class DemoHorse {
    public static void main(String[] args) {
        Horse bill = new Horse("Bill","Blue",1999);
        System.out.println("Name: " + bill.getName() + " Colour: " + bill.getColour() + " Birth: " + bill.getBirth());
        bill.setName("Bob");
        bill.setBirth(1998);
        bill.setColour("Red");
        System.out.println("Name: " + bill.getName() + " Colour: " + bill.getColour() + " Birth: " + bill.getBirth());
        RaceHorse percy = new RaceHorse("Percy","Pink",2000,20);
        System.out.println("Name: " + percy.getName() + " Colour: " + percy.getColour() + " Birth: " + percy.getBirth());

    }
}
