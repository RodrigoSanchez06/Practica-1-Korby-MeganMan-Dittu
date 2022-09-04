import java.util.LinkedList;
import java.util.List;

public class Korby implements Fighter{

    private double life = 100;
    private Item actual;
    private List<Item> availablePowers = new LinkedList<Item>();
    
    @Override
    public Item consumePowers(Item power) {
        // TODO Auto-generated method stub
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
