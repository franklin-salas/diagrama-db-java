/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadb.uml.elemento;
import org.jgraph.graph.DefaultEdge;

/**
 *
 * @author FRANKLIN SALAS
 */
public abstract class  EnlaceBase extends DefaultEdge {
  
    private Clase origen;
    private Clase destino;

    public Clase getOrigen() {
        return origen;
    }

    public void setOrigen(Clase origen) {
        this.origen = origen;
    }

    public Clase getDestino() {
        return destino;
    }

    public void setDestino(Clase destino) {
        this.destino = destino;
     
    }
  
   
  
    
}
