public class Main {
    public static void main(String[] args) {
        // Instancia de prueba para Student
        Student s1 = new Student("Kevin Moreno", "Cll 23 #56-79", "Ingenieria de Software", 2026, 2500000.0);

        // Instancia de prueba para Staff
        Staff t1 = new Staff("Luis Vega", "Pasto, NAR", "Universidad Cooperativa", 5000000.0);

        // Imprimir resultados iniciales
        System.out.println("--- Objetos Creados ---");
        System.out.println(s1.toString());
        System.out.println(t1.toString());

        // Prueba de Setters (Cambio de dirección y pago)
        s1.setAddress("Cali, VAC");
        t1.setPay(5500000.0);

        System.out.println("\n--- Después de actualizar datos ---");
        System.out.println("Nueva dirección de s1: " + s1.getAddress());
        System.out.println("Nuevo pago de t1: " + t1.getPay());
    }
}