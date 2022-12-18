/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadb.script;

import java.util.List;

/**
 *
 * @author Franklin
 */
public class TableDB {
   private String tile;
   private List<TuplaDB> listTupla;
   private List<indexDB> listIndex;
   
   
   
   
  class TuplaDB {
  public String name;
  public String type;
  public boolean isNull;
  public boolean ia;
  
        public TuplaDB() {
        }
  
}
  class indexDB {
  public String name;
  public String column;
  public TableDB tableDB;

        public indexDB() {
        }
  
}
}
