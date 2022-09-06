import java.util.LinkedList;

public class Arena implements Subject{

    private Fighter fighter;
    private LinkedList<Viewer> observerList = new LinkedList<Viewer>();
    private String eventsInTheArea;

    
    public LinkedList<Viewer> getObserverList(){
        return this.observerList;
    }


    @Override
    public void register(Viewer viewer) {
        observerList.add(viewer);       
    }


    @Override
    public void remove(Viewer viewer) { //OJO aqui falta en el UML especificar parámetros
        observerList.remove(viewer);
    }


    @Override
    public void communicate() {
        if (observerList.size() > 0) {
            //Tengo pensado que aquí debemos imprimir en pantalla y empezar a generar los txt
        }
    }

    public void setEventsInTheArea(String eventsInTheArea){
        this.eventsInTheArea = eventsInTheArea;
    }

    public String getEventsInTheArea(){
        return this.eventsInTheArea;
    }
}
