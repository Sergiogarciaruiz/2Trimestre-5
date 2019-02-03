package pkg2trimestre.pkg4;

public class Pizza {

    private String size;
    private String tipo;
    private String estado;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    public Pizza(String tipo, String tamano) {
        this.tipo = tipo;
        this.size = tamano;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

    public static int getTotalPedidas() {
        return Pizza.totalPedidas;
    }

    public static int getTotalServidas() {
        return Pizza.totalServidas;
    }

    @Override
    public String toString() {
        return "Pizza{" + "size=" + size + ", tipo=" + tipo + ", estado=" + estado + '}';
    }

    public void servida() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            Pizza.totalServidas++;
        } else {
            System.out.println("Esta pizza ya se ha servido");
        }
    }

}
