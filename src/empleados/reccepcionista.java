package empleados;


public class reccepcionista extends Empleados {
    private String noche;
    
    
    public reccepcionista() {
    }

    public reccepcionista(String titulo, String especialidad, String ID, String name, String fecha, String puesto, String jornada, int pago, String obligaciones) {
        super(ID, name, fecha, puesto, jornada, pago, obligaciones);
        this.noche=noche;
    }
    

    
    @Override
    public String oligaciones(){
        return "/t atender cliente"+
               "/t recibir llamadas" +
               "/t darte en cuarto"; 
    }
    
    
}
