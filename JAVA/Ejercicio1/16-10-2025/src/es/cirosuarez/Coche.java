package es;

public class Coche extends Vehiculo {

    private String color;
    private String tipo;


    public Coche(String matricula, String marca, String modelo, double precio, String color, String tipo) {
        super(matricula, marca, modelo, precio);
        this.color = color;
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                "} " + super.toString();
    }
}