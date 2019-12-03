public class Scene {

    private String name;
    int takes;
    String partName;
    String partLine;
    int level;

    public Scene(String name){
        setName(name);
    }


    private void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }


    public void addScene(String name, int takes) {
        this.name =name;
        this.takes = takes;
    }

    public void addPart(String part, String line, int lev){
        this.partName =part;
        this.partLine =line;
        this.level = lev;
    }

    public int getBudget(Card a) {
        return a.giveBud();
    }
}
