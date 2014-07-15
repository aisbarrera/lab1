
import java.util.Arrays;


public class RadioG1 implements Radio {
    
private boolean estado, amFm, frecuencia;
private String[] sintonizar;
private double estacion;
	
public RadioG1(){
    estado = true;
    amFm = true;
    estacion = 57.9;
    sintonizar = new String[12];
		
}
    
   @Override
   public void cambiarEstado(boolean estado1) {
      estado = estado1;
       if(estado){
            estado = false;
	}else{
            estado = true;
	}	
    }

    @Override
    public void cambiarFrecuencia(boolean frecuencia1) {
        frecuencia = frecuencia1;
        if(amFm){
            amFm = false;
	}else{
            amFm = true;
	}
    }
    
    @Override
    public void subirEstacion(double estacion1) {
        estacion = estacion1;
        if(amFm){
            if(estacion <= 107.9 && estacion>= 57.9){
		estacion += 0.2;
            }else{
                estacion = 57.9;
            }
        }else{
            if(estacion <= 1610 && estacion>=530){
		estacion += 10;
            }else{
		estacion = 530;
            }
        }
    }

    @Override
    public void bajarEstacion(double estacion1) {
       estacion = estacion1;
        if(amFm){
            if(estacion <= 107.9 && estacion>= 57.9){
		estacion -= 0.2;
            }else{
		estacion = 107.9;
            }
        }else{
            if(estacion <= 1610 && estacion>=530){
		estacion -= 10;
            }else{
		estacion = 1610;
            }
        }
    }

    @Override
    public void guardarEstacion(int boton, double estacion) {
        sintonizar[boton] = estacion+"";
    }

    @Override
    public double sintonizar(int posicion) {
       if(getSintonizar()[posicion] == null){
              guardarEstacion(posicion, getEstacion());
        }
           return Double.parseDouble(getSintonizar()[posicion]);
            } 
    
    public String[] getSintonizar(){
        return sintonizar;
    }
    
    public void setSintonizar(String[] sintonizar) {
	this.sintonizar = sintonizar;
	}
    
    public void setAmFm(boolean amFm) {
	this.amFm = amFm;
	if(amFm){
            estacion = 87.9;
	}else{
            estacion = 530;
	}
    }

    @Override
    public boolean getEstado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
	this.estado = estado;
    }

    @Override
    public boolean getFrecuencia() {
        return amFm;
    }

    @Override
    public double getEstacion() {
        return estacion;
    }
   
    public void setEstacion(double estacion) {
	this.estacion = estacion;
	}
    
    @Override
    public String toString() {
        return "RadioCarro [estado=" + estado + ", amFm=" + amFm
		+ ", sintonizar=" + Arrays.toString(sintonizar)
		+ ", estacion=" + estacion + "]";
	}
    
}