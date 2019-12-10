package bsu.rfe.java.group7.lab1.Fyodorov.varA2;


public class Pie extends Food {
    private String filling = null;
    private String testo = null;

    public Pie(String filling, String testo) {
        super("Pie");
        this.filling = filling;
        this.testo = testo;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getFilling() {
        return this.filling;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return this.testo;
    }

    public void consume() {
        System.out.println(this + " has been eaten");
    }

    public String toString() {
        String var10000;
        if (this.testo == null) {
            var10000 = super.toString();
            return var10000 + " filling of '" + this.filling.toUpperCase() + "'";
        } else {
            var10000 = super.toString();
            return var10000 + " filling of " + this.filling.toUpperCase() + "' and '" + this.testo.toUpperCase() + "'";
        }
    }

    public boolean equals(Object arg0) {
        if (!super.equals(arg0)) {
            return false;
        }
        else {
            return ((Pie)arg0).getFilling().equals(this.getFilling())  && ((Pie)arg0).getTesto().equals(this.getTesto());
        }
    }
}
