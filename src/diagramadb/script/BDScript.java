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
public class BDScript implements ScriptsInterfaz{
    protected String nameProyect;
    protected List<TBScript> tbScripts;
    
    public  BDScript(){
    this.tbScripts = new LinkedList<>();
    }

    public String getNameProyect() {
        return nameProyect;
    }

    public void setNameProyect(String nameProyect) {
        this.nameProyect = nameProyect;
    }
    public void setTBScript(TBScript tb) {
        this.tbScripts.add(tb);
    }
    public TBScript remove(int i) {
     return this.tbScripts.remove(i);
    }
     public TBScript indexOfID(int i) {
         for (TBScript tbScript : tbScripts) {
             if(tbScript.id == i) return tbScript;
         }
         return null;
    }
    @Override
    public String getScript() {
     String s = CreateEnum.CREATEDB+"  "+this.nameProyect+" ; ";
        for (TBScript tbScript : tbScripts) {
          s=s+ "  \n\n"+tbScript.getScript();
        }
   return s;
    }
    
    
}
