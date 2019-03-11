/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.view.graficas;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import modelo.controllers.ControllerOrdenProduccion;


@Named(value = "controllerGraficas")
@RequestScoped
public class ControllerGraficas {

    //Lista de clase graficas
    List<Graficas> datos;
    
    //Inyeccion del controlador
    @Inject
    private ControllerOrdenProduccion COP;
    
    //Variables
    private List<Object[]> lis;
    private String tipo;
   
    //Constructor vasio
    public ControllerGraficas() {
    }
    
    //PostContructor
    @PostConstruct
    private void init(){
        lis = new ArrayList<>();
        tipo = "column";
    }

    public List<Graficas> getDatos() {
        lis = COP.getListaDeVentasPorFecha();
        if (datos == null || datos.isEmpty()) {
            datos = new ArrayList<>();
            for (int i = 0; i < lis.size(); i++) {
                datos.add(new Graficas(i, (Long) lis.get(i)[1], lis.get(i)[0].toString()));
            }
        }
        return datos;
    }    
    
    public String getDatosJsonFechas(){
        Gson gson = new Gson();
        return gson.toJson(getDatos());
    }
    
}
