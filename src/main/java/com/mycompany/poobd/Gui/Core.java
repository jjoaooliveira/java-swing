package com.mycompany.poobd.Gui;

import java.beans.PropertyChangeListener;
import javax.swing.event.SwingPropertyChangeSupport;

public class Core {
    public static final String MODELO = "modelo";
    public static final String COR = "cor";
    public static final String ANO = "ano";
    public static final String ID = "id";
    private SwingPropertyChangeSupport pcSupport = new SwingPropertyChangeSupport(this);
    private String modelo;
    private String cor;
    private String ano;
    private String id;
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
      pcSupport.addPropertyChangeListener(listener);
   }
    
    public void setModelo(String modelo) {
        String valorAntigo = this.modelo;
        String valorNovo = modelo;
        
        pcSupport.firePropertyChange("modelo", valorAntigo, valorNovo);
    }
    
    public void setCor(String cor) {
        String valorAntigo = this.cor;
        String valorNovo = cor;
        
        pcSupport.firePropertyChange("cor", valorAntigo, valorNovo);
    }
    
    public void setAno(String ano) {
        String valorAntigo = this.ano;
        String valorNovo = ano;
        
        pcSupport.firePropertyChange("ano", valorAntigo, valorNovo);
    }
    
    public void setId(String id) {
        String valorAntigo = this.id;
        String valorNovo = id;
        
        pcSupport.firePropertyChange("id", valorAntigo, valorNovo);
    }
}
