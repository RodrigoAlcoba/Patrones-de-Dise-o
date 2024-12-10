public class ControladorAuto {
private VistaAuto vistaAuto;
private Auto auto;
private Estacionamiento estacionamiento;
private Lavadero lavadero;
    public ControladorAuto(Auto auto,VistaAuto vistaAuto,Lavadero lavadero, Estacionamiento estacionamiento) {
        this.vistaAuto = vistaAuto;
        this.auto = auto;
        this.lavadero = lavadero;
        this.estacionamiento = estacionamiento;
    }

    public ControladorAuto(){

    }

    public void actualizarVista() {
        vistaAuto.mostrarDetallesAuto(auto);
    }

    public void lavarAuto(){
        lavadero.lavarAuto(auto);
    }

    public void estacionarAuto(){
        estacionamiento.estacionarAuto(auto);
    }

    public void desEstacionarAuto(){
        estacionamiento.desEstacionarAuto(auto);
    }
    public void setVistaAuto(VistaAuto vistaAuto) {
        this.vistaAuto = vistaAuto;
    }

    public VistaAuto getVistaAuto() {
        return vistaAuto;
    }

    public Auto getAuto() {
        return auto;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public Lavadero getLavadero() {
        return lavadero;
    }

    public void setLavadero(Lavadero lavadero) {
        this.lavadero = lavadero;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;


    }
}
