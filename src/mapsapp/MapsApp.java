/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapsapp;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Thiago
 */
public class MapsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Html();
    }
    
    public static void Html(){
        try{
            File htmlFile = new File("C:\\Users\\Thiago\\Documents\\NetBeansProjects\\MapsApp\\src\\mapsapp\\drawing.html");
            Desktop.getDesktop().browse(htmlFile.toURI());
        }catch (IOException ex) {
            Logger.getLogger(MapsApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
