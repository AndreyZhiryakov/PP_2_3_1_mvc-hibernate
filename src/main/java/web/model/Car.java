package web.model;

public class Car {
    private int id;
    private String model;
    private int seria;

    public Car(int id, String model, int seria) {
        this.id = id;
        this.model = model;
        this.seria = seria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeria() {
        return seria;
    }

    public void setSeria(int seria) {
        this.seria = seria;
    }
}