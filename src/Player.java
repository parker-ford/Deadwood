public class Player {
    private String name;
    private int money;
    private int credits;
    private int rank;
    private Scene currentScene;

    public Player(String newName) {
        setName(newName);
        setMoney(0);
        setCredits(0);
        setRank(1);
    }



    public int makeMove() {
        return 0;
    }

    public void upgrade() {
    }

    public void takeRole() {
    }




    //Getters and Setters
    public void moveScene(Scene current){
        this.currentScene = current;
    }
    public Scene getScene(){
        return this.currentScene;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney(){
        return this.money;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }

    public int getCredits(){
        return this.credits;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return this.rank;
    }
}