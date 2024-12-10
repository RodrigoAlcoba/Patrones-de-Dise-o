public class VistaAuto {
    public void mostrarDetallesAuto(Auto auto) {
        System.out.println("Detalles del Auto:");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Color: " + auto.getColor());
        System.out.println("Tipo de Combustible: " + auto.getTipoCombustible());
        System.out.println("Matricula: " + auto.getMatricula());
        System.out.println("Nombre Dueño: " + auto.getNombreDuenio());
    }
}