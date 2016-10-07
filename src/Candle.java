/**
 * Created by jc321258 on 12/09/16.
 */
public class Candle {
    protected String colour;
    protected double price, height;

    public Candle() {}

    public Candle(String colour, Double height) {
        setColour(colour);
        setHeight(height);
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price = height * 2;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public double getHeight() {
        return height;
    }
}
