package Prototype;

public abstract class Droid implements Cloneable {
    private String id;
    abstract void doSmth();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
