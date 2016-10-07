/**
 * Created by jc321258 on 12/09/16.
 */
public class Horse {
    protected String name,colour;
    protected Integer birth;    // Birth year

    public Horse() {}

    public Horse(String name, String colour, Integer birth) {
        setName(name);
        setColour(colour);
        setBirth(birth);
    }

    public String getColour() {
        return colour;
    }

    public Integer getBirth() {
        return birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBirth(Integer birth) {
        this.birth = birth;
    }
}
