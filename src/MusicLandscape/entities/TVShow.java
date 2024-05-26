package MusicLandscape.entities;

public class TVShow extends Event {
    private String name;
    private int viewers;

    public TVShow(){
        this.name = "unknown";
        this.viewers = 0;
    }
    //constructor that performs a deep copy of an Event
    public TVShow(Event e){
        super(new Event(e)); //call copy constructor of even
        this.viewers = 0;
    }
    public TVShow(TVShow tvs){
        this.name = tvs.name;
        this.viewers = tvs.viewers;
    }

    public int getViewers(){
        return this.viewers;
    }

    public void setViewers(int v){
        this.viewers = v;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("%s @ %s on %s\n%s\n(%d attending (%d))",
                getName(), name, getDate(), getDescription(), impact());
    }

    @Override
    public int impact(){
        return (viewers * getAttendees() * 2);
    }

}
