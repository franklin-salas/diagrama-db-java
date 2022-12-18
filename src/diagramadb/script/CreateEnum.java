/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadb.script;

/**
 *
 * @author FRANKLIN SALAS
 */
public  enum CreateEnum {
    
    CREATEDB  {
        @Override
        public String toString() {
            return "CREATE DATABASE";
        }        
    },
     CREATETABLE {
        @Override
        public String toString() {
            return "CREATE TABLE";
        }
     
     },
     NOTNULL {
        @Override
        public String toString() {
            return "NOT NULL";
        }
    },
     NULL {
       @Override
        public String toString() {
            return "NULL";
        }
     },
     CONSTRAINT {    
         @Override
        public String toString() {
            return "CONSTRAINT";
        }
     },
     FK {
       @Override
        public String toString() {
            return "FOREIGN KEY";
        }
     },
     PK {
       @Override
        public String toString() {
            return "PRIMARY KEY";
        }
     },
     REFERENCES {
       @Override
        public String toString() {
            return "REFERENCES";
        }
     };
     
    
}
