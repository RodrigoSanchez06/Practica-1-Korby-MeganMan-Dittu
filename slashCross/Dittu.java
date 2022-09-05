import java.util.LinkedList;
import java.util.List;

public class Dittu implements Fighter{

    private Item actual;
    private double life=100;
    private final double DAÑO_BASE=10;
    private List<Item> availablePowers = new LinkedList<Item>();

    @Override
    public Item consumePowers(Item power) {
        // TODO Auto-generated me
        return null;
    }

    @Override
    public double defend() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double attack() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
