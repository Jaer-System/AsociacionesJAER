/**
 *Cuatrimestre : 		2019-1
 *Grupo: 			ITIC-901-M
 *Nombre del Equipo:		System JAER
 *Integrantes del equipo :      González Morales Maria Anhel.
 *			   	Modesto Paredes Jennifer.
 *		          	Reyes González Raúl.
 *			  	Solano Salazar Anthony Enrique. 
**/

package ejermvc;

/*  Dell 8 Intel-Core¡5 64Bits */

class MoComputadora {
 static String marca;
 static String respuesta;
 static String procesador;
 static String sistema;
 static Integer ram;

    public MoComputadora() {
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        MoComputadora.marca = marca;
    }

    public static String getRespuesta() {
        return respuesta;
    }

    public static void setRespuesta(String respuesta) {
        MoComputadora.respuesta = respuesta;
    }

    public static Integer getRam() {
        return ram;
    }

    public static void setRam(Integer ram) {
        MoComputadora.ram = ram;
    }

    public static String getProcesador() {
        return procesador;
    }

    public static void setProcesador(String procesador) {
        MoComputadora.procesador = procesador;
    } 

    public static String getSistema() {
        return sistema;
    }

    public static void setSistema(String sistema) {
        MoComputadora.sistema = sistema;
    }
    
    
}


class ConComputadora {
 static void recuperaComputadora() {
   MoComputadora.marca = MoComputadora.getMarca();
   MoComputadora.procesador = MoComputadora.getProcesador();
   MoComputadora.ram = MoComputadora.getRam();
   MoComputadora.sistema = MoComputadora.getSistema();
 }
  static void muestraComputadora() {
   System.out.println(MoComputadora.respuesta);
 }
}


public class EjerMvc {
 public static void main(String[] c1) {
    ConComputadora.recuperaComputadora();
    MoComputadora.respuesta = "Marca: " + c1[0];
    ConComputadora.muestraComputadora();
        
    ConComputadora.recuperaComputadora();
    MoComputadora.respuesta = "Procesador: " + c1[2];
    ConComputadora.muestraComputadora();
    
    ConComputadora.recuperaComputadora();
    MoComputadora.respuesta = "Sistema Operativo: " + c1[3];
    ConComputadora.muestraComputadora();
    
    ConComputadora.recuperaComputadora();
    MoComputadora.respuesta = "Ram: " + c1[1];
    ConComputadora.muestraComputadora();
    
    }
}
