
public interface Radio {
    
    public void cambiarEstado(boolean estado1); 
    public void cambiarFrecuencia(boolean frecuencia1); /// am false fm true 
    public void subirEstacion(double estacion); 
    public void bajarEstacion(double estacion); 
    public void guardarEstacion(int boton, double estacion);
    public double sintonizar(int posicion);
    public boolean getEstado();
    public boolean getFrecuencia();
    public double getEstacion();
    
    final double inicio_am = 530, final_am = 1610, inicio_fm = 57.9, final_fm = 107.9, paso_am = 10, paso_fm = 0.2;
}
