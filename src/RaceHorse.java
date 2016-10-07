/**
 * Created by jc321258 on 12/09/16.
 */
public class RaceHorse extends Horse {
    protected Integer num;

    public RaceHorse() {}

    public RaceHorse(String name, String colour, Integer birth, Integer num) {
        super(name,colour,birth);
        setNum(num);
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
