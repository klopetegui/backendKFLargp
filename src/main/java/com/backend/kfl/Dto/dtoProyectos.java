package com.backend.kfl.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyectos {

    @NotBlank
    private String nombreP;

    @NotBlank
    private String descripcion;
    @NotBlank
    private String img ;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcion, String img) {
        this.nombreP = nombreP;
        this.descripcion = descripcion;
        this.img = img;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
