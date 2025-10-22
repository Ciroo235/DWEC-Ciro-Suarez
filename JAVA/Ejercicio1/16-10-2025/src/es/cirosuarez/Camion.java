package es;

public class Camion extends Vehiculo {
    private boolean nacional;
    private double peso;

    public Camion(String matricula, String marca, String modelo, double precio, boolean nacional, double peso) {
        super(matricula, marca, modelo, precio);
        this.nacional = nacional;
        this.peso = peso;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "nacional=" + nacional +
                ", peso=" + peso +
                "} " + super.toString();
    }
}
