package lab9_p1_jonatanvallecillo;

public class Herramientas {
    String nombre = "";
    String material = "";

    public Herramientas() {
    }
    
    public Herramientas(String nombre, String material) {
        this.nombre = nombre;
        this.material = material;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
