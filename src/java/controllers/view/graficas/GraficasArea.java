/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.view.graficas;

/**
 *
 * @author nicol
 */
public class GraficasArea {

    private double x;
    private double y;
    private double label;

    public GraficasArea() {
    }

    public GraficasArea(double x, double y, double label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getLabel() {
        return label;
    }

    public void setLabel(double label) {
        this.label = label;
    }

    
}
