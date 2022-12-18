/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadb.uml.elemento;

import java.util.Hashtable;
import java.util.Map;
import org.jgraph.graph.GraphConstants;

/**
 *
 * @author FRANKLIN SALAS
 */
public class Asociacion extends Enlace{
    
    public Asociacion() {
      //  super(EnlaceEnum.ASOCIACION);
           Map map = new Hashtable();
        GraphConstants.setLineBegin(map, GraphConstants.ARROW_NONE);
        GraphConstants.setLineEnd(map, GraphConstants.ARROW_NONE);
        GraphConstants.setLabelAlongEdge(map, true);
        getAttributes().applyMap(map);
    }

   
    
   
    

   
    
}
