package com.itson.NebulaMusic.model;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;
    private String pseudonimo;
    private String genero;
    private String suscripcion;
    private String fechaNacimiento;
    private String terminos;
    private String comentarios;

    public Usuario() {
        // ...
    }

    public Usuario(String comentarios, String terminos, String fechaNacimiento, String suscripcion, String genero, String pseudonimo, String contrasena, String correo, String nombre) {
        this.comentarios = comentarios;
        this.terminos = terminos;
        this.fechaNacimiento = fechaNacimiento;
        this.suscripcion = suscripcion;
        this.genero = genero;
        this.pseudonimo = pseudonimo;
        this.contrasena = contrasena;
        this.correo = correo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTerminos() {
        return terminos;
    }

    public void setTerminos(String terminos) {
        this.terminos = terminos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", pseudonimo='" + pseudonimo + '\'' +
                ", genero='" + genero + '\'' +
                ", suscripcion='" + suscripcion + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", terminos='" + terminos + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
