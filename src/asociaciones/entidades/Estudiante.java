/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociaciones.entidades;

import java.util.List;



/**
 *
 * @author 
 */
public class Estudiante {
    private List<Curso> listaCurso;
    private String codigo;
    private String nombre;

    /**
     * @return the listaCurso
     */
    public List<Curso> getListaCurso() {
        return listaCurso;
    }

    /**
     * @param listaCurso the listaCurso to set
     */
    public void setListaCurso(List<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
