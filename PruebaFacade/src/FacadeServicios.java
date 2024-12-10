public class FacadeServicios {
private ControladorAuto controladorAuto;
private Lavadero lavadero;

private Estacionamiento estacionamiento;

    public FacadeServicios(ControladorAuto controladorAuto, Lavadero lavadero, Estacionamiento estacionamiento) {
        this.controladorAuto = controladorAuto;
        this.lavadero = lavadero;
        this.estacionamiento = estacionamiento;
    }

    public void servicioCompleto() {
        controladorAuto.desEstacionarAuto();
        controladorAuto.lavarAuto();
        controladorAuto.estacionarAuto();
        controladorAuto.actualizarVista();
    }
}
