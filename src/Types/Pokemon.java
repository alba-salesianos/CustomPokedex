package Types;

public class Pokemon {
    protected String name;
    protected String type;
    protected double height;
    protected double weight;
    protected String description;
    public Pokemon(String name, String type, double height, double weight, String description){
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.description = description;
    }

    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getDescription() {
        return this.description;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String msg = "════════════════════════════════════";
        msg += "\n" + this.name.toUpperCase();
        msg += "\n" + this.type.toUpperCase();
        msg += "\n" + "HT    " + this.height;
        msg += "\n" + "WT    " + this.weight + "lb";
        msg += "\n" + "──█──█──█──█────────────█──█──█──█──";
        msg += "\n" + this.description;
        return msg;
    }
}
