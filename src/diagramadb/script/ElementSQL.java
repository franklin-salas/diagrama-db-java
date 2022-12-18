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
public abstract class ElementSQL {
    protected String titleDB;
    protected List<TableDB> listTable;
    public String generarScriptDB(){
        return null;
    }
    
    protected abstract String getTitleDB(String title);
    
    protected abstract String getTable(TableDB table );
}
