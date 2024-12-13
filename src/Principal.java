public class Principal {
    public static void main(String[] args) {
        ConsultaAPI consulta = new ConsultaAPI();
        Moneda moneda = consulta.buscaMoneda("ARS");
        System.out.println(moneda);
    }
}
