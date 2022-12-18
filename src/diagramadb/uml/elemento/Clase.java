/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadb.uml.elemento;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;

/**
 *
 * @author FRANKLIN SALAS
 */
public class Clase extends DefaultGraphCell implements TComponente {

     
      private String nombre;
      private List<Atributo> atributos = new ArrayList<Atributo>();
      private  LienzoInterfaz diag;
      private int id;
      private VisibilidadEnum alcance;

    public VisibilidadEnum getAlcance() {
        return alcance;
    }

    public void setAlcance(VisibilidadEnum alcance) {
        this.alcance = alcance;
    }

    public void listinerPintado(LienzoInterfaz d){
       this.diag=d;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
      public Clase(String nombre) {
        super(nombre);
        Map map = new Hashtable();
        GraphConstants.setEditable(map, false);
        this.getAttributes().applyMap(map);
        this.nombre = nombre;
        this.alcance= VisibilidadEnum.PUBLIC;
    }

    public List<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void actualizarPintado() {
      diag.repintar(this);
    }
    
}
