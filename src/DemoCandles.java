/**
 * Created by jc321258 on 12/09/16.
 */
public class DemoCandles {
    public static void main(String[] args) {
        Candle candle = new Candle("blue",4.0);
        System.out.println("Colour: " + candle.getColour() + " Height: " + candle.getHeight() + " Price: " + candle.getPrice());
        ScentedCandle scented = new ScentedCandle("blue",4.0,"Turkey");
        System.out.println("Colour: " + scented.getColour() + " Height: " + scented.getHeight() + " Price: " + scented.getPrice() + " Scent: " + scented.getScent());
    }
}
