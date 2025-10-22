package es;

public class Moto extends Vehiculo {

    private int cilindrada;
    private int caballos;

    public Moto(String matricula, String marca, String modelo, double precio, int cilindrada, int caballos) {
        super(matricula, marca, modelo, precio);
        this.cilindrada = cilindrada;
        this.caballos = caballos;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", caballos=" + caballos +
                "} " + super.toString();
    }
}