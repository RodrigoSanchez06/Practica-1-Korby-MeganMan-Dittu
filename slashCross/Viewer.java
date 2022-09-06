public class Viewer implements Observer{

    private int viewerId;
    private String viewerName;
    private Fighter favoriteFighter;
    private Arena fightingPlace;
    private String eventsInTheArena;

    public Viewer(int viewerId, Fighter favoriteFighter, Arena fightingPlace, String viewerName){
        this.viewerId = viewerId;
        this.favoriteFighter = favoriteFighter;
        this.fightingPlace = fightingPlace;
        this.viewerName = viewerName;
    }

    @Override
    public void update() {
        
    }

    public int getViewerId(){
        return this.viewerId;
    }

    public String getViewerName(){
        return this.viewerName;
    }

    public Fighter getFavoriteFighter(){
        return this.favoriteFighter;
    }

}
