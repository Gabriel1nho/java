package empleados;



public class portero extends Empleados{
    private String edad_avanzada;
    
    public portero() {
    }

    public portero(String titulo, String especialidad, String ID, String name, String fecha, String puesto, String jornada, int pago, String obligaciones) {
        super(ID, name, fecha, puesto, jornada, pago, obligaciones);
        this.edad_avanzada=edad_avanzada;
    }

    public String getedad() {
        return edad_avanzada;
    }

    public void setedad(String titulo) {
        this.edad_avanzada = edad_avanzada;
    }

    
   
}
