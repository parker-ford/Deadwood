public class Acting {
    int roletype;
    int dice;
    Scene currentscene;
    boolean good = true;
    int payall;

    public Acting() {
    }

    public boolean success(int getdice) {
        return this.good;
    }

    public int decidePay(Scene curr) {
        return this.payall;
    }

    public void checkscene() {
    }
}
