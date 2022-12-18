/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadb.uml.elemento;

/**
 *
 * @author FRANKLIN SALAS
 */
public class Atributo {
   
    private VisibilidadEnum visibilidad;
    private String variable;
    private String tipo;

    public Atributo() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public VisibilidadEnum getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(VisibilidadEnum visibilidad) {
        this.visibilidad = visibilidad;
    }

    @Override
    public String toString() {
       
        
        return " " + variable + ":" + tipo;
    }

  

}
