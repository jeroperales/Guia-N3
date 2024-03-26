public class EmpleadoTiempoCompleto extends Empleado {
    public EmpleadoTiempoCompleto(String nombre, float salario) {
        super(nombre, salario);
    }

    @Override
    public float calcularPago() {
        return this.getSalario();
    }
}


