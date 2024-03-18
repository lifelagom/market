import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    private List<Actor> listMarket = new ArrayList<Actor>();
    private List<Actor> listQueue = new LinkedList<Actor>();
    
    @Override
    public void acceptToMarket(Actor actor) {
        listMarket.add(actor);
        System.out.println(actor.name+" зашел в магазин");
    }

    @Override
    public void releaseFromMarket() {
        listMarket.clear();
        System.out.println("покупатели вышли из магазина");
    }

    @Override
    public void takeInQueue(Actor actor) {
        listQueue.add(actor);
        System.out.println(actor.name+" занял очередь");
    }

    @Override
    public void takeOrders() {
        listQueue.get(0).setMakeOrder();
    }

    @Override
    public void giveOrders() {
        listQueue.get(0).setTakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        listQueue.removeFirst();
    }
}
