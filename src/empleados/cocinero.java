
package empleados;



public class cocinero extends Empleados{
    private String titulo;
    private String especialidad;
    
    public cocinero() {
    }

    public cocinero(String titulo, String especialidad, String ID, String name, String fecha, String puesto, String jornada, int pago, String obligaciones) {
        super(ID, name, fecha, puesto, jornada, pago, obligaciones);
        this.titulo = titulo;
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
   
}
