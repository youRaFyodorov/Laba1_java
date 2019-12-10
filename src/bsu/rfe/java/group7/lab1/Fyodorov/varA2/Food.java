package bsu.rfe.java.group7.lab1.Fyodorov.varA2;

public abstract class Food implements Consumable {
    protected String name = null;

    public Food(String name) {
        this.name = name;
    }

    public String getName() { //возвращает имя
        return this.name;
    }

    public void setName(String name) { // ставить имя
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) {
            return false;
        } else {
            return this.name != null && ((Food)arg0).name != null ? this.name.equals(((Food)arg0).name) : false;
        }
    }

    public boolean equals_type(Object arg0) {
        if (!(arg0 instanceof Food)) {
            return false;
        } else if (this.name != null && ((Food)arg0).name != null) {
            return this.name.equals(((Food)arg0).name);
        } else {
            return false;
        }
    }
}
