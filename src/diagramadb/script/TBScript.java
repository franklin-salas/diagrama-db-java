/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadb.script;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author FRANKLIN SALAS
 */
public class TBScript  implements ScriptsInterfaz{
   
    public int id ;
    private String nombre;
    private List<String> atributos;
    private List<String> tipo;
    private List<String> fk;
    private List<String> tabla;

    public TBScript() {
        this.atributos = new LinkedList<>();
        this.fk = new LinkedList<>();
        this.tabla = new LinkedList<>();
         this.tipo = new LinkedList<>();
  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAtributo(String nombre, String tipo) {
        this.atributos.add(nombre);
        this.tipo.add(tipo);
    }
    
    public void setFK(String nombre , String tabla ,String tipo) {
        this.fk.add(nombre);
        this.tabla.add(tabla);
        this.atributos.add(nombre+"_"+tabla);
        this.tipo.add(tipo);
    }

    @Override
    public String getScript() {
       String s = CreateEnum.CREATETABLE.toString() +" "+this.nombre +"  ( \n";
        for (int i = 0; i <this.atributos.size(); i++) {
            if(i != 0){
                s=s+",\n  "+this.atributos.get(i)+ " "+this.tipo.get(i)+" " ;
            }else{
             s=s+ "  "+this.atributos.get(i)+ " "+this.tipo.get(i)+" " + CreateEnum.PK.toString();
            }
        }
           for (int i = 0; i <this.fk.size(); i++) {
          
                s=s+",\n  "+CreateEnum.FK+ " ( "+this.fk.get(i)+"_"+this.tabla.get(i)+ " ) "
                        +CreateEnum.REFERENCES.toString()+" "+this.tabla.get(i)+ " ( "+this.fk.get(i)+" )" ;   
        }   
       
      return  s +"\n  );";
    }
    
    
}
