public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    public EmpleadoPorHora(String nombre, float salario,int horasTrabajadas) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public float calcularPago() {
        float pago = this.getSalario() * horasTrabajadas;
        return pago;
    }
}