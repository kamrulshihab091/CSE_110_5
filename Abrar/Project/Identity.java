public abstract class Identity {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return this.name;
    }

    public abstract void update();
}