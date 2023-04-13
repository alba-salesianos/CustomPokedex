package Types;

public class Legendary extends Pokemon {

    private String location;
    public Legendary(String name, String type, String height, double weight, String description, String location) {
        super(name, type, height, weight, description);
        this.location = location;
    }

    public Legendary(String name, String type) {
        super(name, type);
        this.location = location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        String msg = "\n" + "══════════════════════════════════════════════════════════════";
        msg += "\n" + this.name.toUpperCase();
        msg += "\n" + this.type.toUpperCase();
        msg += "\n" + "HT    " + this.height;
        msg += "\n" + "WT    " + this.weight + "lb";
        msg += "\n" + "Location    " + this.location;
        msg += "\n" + "──█──█──█──█──────────────────────────────────────█──█──█──█──";
        msg += "\n" + this.description;
        msg += "\n" + "══════════════════════════════════════════════════════════════";
        return msg;

        //TODO: poner que si no hay datos aparezcan interrogaciones
    }
}
