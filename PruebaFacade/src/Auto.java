//Modelo.
public class Auto {

    //Atributos.
    private String marca;
    private String modelo;
    private String color;
    private String tipoCombustible;
    private String matricula;
    private String nombreDuenio;

    //Constructor con params.
    public Auto(String marca, String modelo, String color, String tipoCombustible, String matricula, String nombreDuenio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.matricula = matricula;
        this.nombreDuenio = nombreDuenio;
    }

    //Getters & Setters.
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }
}
