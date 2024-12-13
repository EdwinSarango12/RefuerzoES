package org.example;

public class ComunidadEPN {
    private String cedula;
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private String correo;

    public ComunidadEPN() {
    }

    public ComunidadEPN(String cedula, String nombre, int edad, String direccion, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //metodos personalizados
    public void MostrarDatos(){
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Correo: " + this.correo);
    }
    public String MostrarDatos2(){
        String resultado= "Cedula: " + this.cedula
                + "\nNombre: " + this.nombre
                + "\nEdad: " + this.edad
                + "\nDireccion: " + this.direccion
                + "\nTelefono: " + this.telefono
                + "\nCorreo: " + this.correo;
        return resultado;

    }
}