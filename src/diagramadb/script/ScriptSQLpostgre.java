/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadb.script;

import diagramadb.uml.elemento.Atributo;
import diagramadb.uml.elemento.CardinalidadEnum;
import diagramadb.uml.elemento.Clase;
import diagramadb.uml.elemento.Enlace;
import java.util.List;
import org.jgraph.*;
import org.jgraph.graph.CellView;

/**
 *
 * @author FRANKLIN SALAS
 */
public class ScriptSQLpostgre extends BDScript{

    public ScriptSQLpostgre() {
        super();
    }
    
    public   String classToBD( CellView cells[]){
        
      for (int i = cells.length-1; i >=0; i--) {
            CellView cellView = cells[i];
            Object o = cellView.getCell();
            if (o != null && o instanceof Clase) {
           TBScript t =   classToTBScript((Clase) o);
            this.tbScripts.add(t);
               
            }else if(o instanceof Enlace){
               
               enlaceToTable((Enlace) o);
            }
        }
    return this.getScript();
    }
    
    public  TBScript classToTBScript(Clase c){
    TBScript t = new TBScript();
    t.id=c.getId();
    t.setNombre(c.getNombre());
        List<Atributo> lis = c.getAtributos();
        for (Atributo a : lis) {      
           t.setAtributo(a.getVariable(),a.getTipo());
          
        }
    return t;
    }
    public void enlaceToTable(Enlace e){
        
        if (e.getCardinalidadO().equals(CardinalidadEnum.One2One) &&
            e.getCardinalidadD().equals(CardinalidadEnum.Zero2One)) {  
            relacionEnlaceSimple(e.getOrigen(), e.getDestino());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.One2One) &&
            e.getCardinalidadD().equals(CardinalidadEnum.One2One)) {
            relacionEnlaceSimple(e.getOrigen(), e.getDestino());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.One2One) &&
            e.getCardinalidadD().equals(CardinalidadEnum.Zero2Many)) {
            relacionEnlaceSimple(e.getOrigen(), e.getDestino());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.One2One) &&
            e.getCardinalidadD().equals(CardinalidadEnum.One2Many)) {
            relacionEnlaceSimple(e.getOrigen(), e.getDestino());
        } else
         if (e.getCardinalidadO().equals(CardinalidadEnum.Zero2One) &&
            e.getCardinalidadD().equals(CardinalidadEnum.Zero2One)) { 
             relacionEnlaceSimple(e.getOrigen(), e.getDestino());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.Zero2One) &&
            e.getCardinalidadD().equals(CardinalidadEnum.One2One)) {
            relacionEnlaceSimple(e.getDestino(), e.getOrigen());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.Zero2One) &&
            e.getCardinalidadD().equals(CardinalidadEnum.Zero2Many)) {
            relacionEnlaceSimple(e.getOrigen(), e.getDestino());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.Zero2One) &&
            e.getCardinalidadD().equals(CardinalidadEnum.One2Many)) {
            relacionEnlaceSimple(e.getOrigen(), e.getDestino());
        } else
         if (e.getCardinalidadO().equals(CardinalidadEnum.Zero2Many) &&
            e.getCardinalidadD().equals(CardinalidadEnum.Zero2One)) { 
              relacionEnlaceSimple(e.getDestino(), e.getOrigen());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.Zero2Many) &&
            e.getCardinalidadD().equals(CardinalidadEnum.One2One)) {
             relacionEnlaceSimple(e.getDestino(), e.getOrigen());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.Zero2Many) &&
            e.getCardinalidadD().equals(CardinalidadEnum.Zero2Many)) {
             relacionEnlaceComplejo(e.getOrigen(), e.getDestino());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.Zero2Many) &&
            e.getCardinalidadD().equals(CardinalidadEnum.One2Many)) {
              relacionEnlaceComplejo(e.getOrigen(), e.getDestino());
        }else
         if (e.getCardinalidadO().equals(CardinalidadEnum.One2Many) &&
            e.getCardinalidadD().equals(CardinalidadEnum.Zero2One)) { 
              relacionEnlaceSimple(e.getDestino(), e.getOrigen());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.One2Many) &&
            e.getCardinalidadD().equals(CardinalidadEnum.One2One)) {
                          relacionEnlaceSimple(e.getDestino(), e.getOrigen());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.One2Many) &&
            e.getCardinalidadD().equals(CardinalidadEnum.Zero2Many)) {
             relacionEnlaceComplejo(e.getOrigen(), e.getDestino());
        }else if(e.getCardinalidadO().equals(CardinalidadEnum.One2Many) &&
            e.getCardinalidadD().equals(CardinalidadEnum.One2Many)) {
             relacionEnlaceComplejo(e.getOrigen(), e.getDestino());
        }
    }
    public  void relacionEnlaceSimple(Clase o,Clase d){
         TBScript cd = indexOfID(d.getId());
        
    cd.setFK(o.getAtributos().get(0).getVariable(),o.getNombre(),o.getAtributos().get(0).getTipo());
    
    }
     public  void relacionEnlaceComplejo(Clase o,Clase d){
         TBScript n = new TBScript();
         n.id = -1;
         n.setNombre(o.getNombre()+"_"+d.getNombre());
         n.setAtributo("id","Int");
         n.setFK(o.getAtributos().get(0).getVariable(),o.getNombre(),o.getAtributos().get(0).getTipo());
         n.setFK(d.getAtributos().get(0).getVariable(),d.getNombre(),d.getAtributos().get(0).getTipo());
         this.tbScripts.add(n);
    }
}
