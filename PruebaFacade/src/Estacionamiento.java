public class Estacionamiento {

    public void estacionarAuto(Auto auto) {
        System.out.println("Estacionando el auto: " + auto.getMarca() + " " + auto.getModelo());
    }

    public void desEstacionarAuto(Auto auto) {
        System.out.println("Desestacionando el auto: " + auto.getMarca() + " " + auto.getModelo());
    }
}