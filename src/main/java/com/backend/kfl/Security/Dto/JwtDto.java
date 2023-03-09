
package com.backend.kfl.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;


public class JwtDto {
    private String token;
    private String bearer= "Bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> autorithies;
    //constructores

    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> autorithies) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.autorithies = autorithies;
    }
//Getter and Setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAutorithies() {
        return autorithies;
    }

    public void setAutorithies(Collection<? extends GrantedAuthority> autorithies) {
        this.autorithies = autorithies;
    }
    
}
