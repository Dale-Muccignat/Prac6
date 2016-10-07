/**
 * Created by jc321258 on 12/09/16.
 */
public class Poem {
    protected String name;
    protected int num;

    public Poem() {}

    public Poem(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public void display() {
        System.out.println("Poem name: " + name + ". Line number: " + num);
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
}
