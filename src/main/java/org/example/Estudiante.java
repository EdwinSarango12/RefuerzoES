package org.example;

public class Estudiante extends ComunidadEPN {
    private int codigo;
    private String periodo;
    private String club;
    private String aso;

    public Estudiante() {
    }

    public Estudiante(String cedula, String nombre, int edad, String direccion, String telefono, String correo, int codigo, String periodo, String club, String aso) {
        super(cedula, nombre, edad, direccion, telefono, correo);
        this.codigo = codigo;
        this.periodo = periodo;
        this.club = club;
        this.aso = aso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getAso() {
        return aso;
    }

    public void setAso(String aso) {
        this.aso = aso;
    }
    //metodos personalizados

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("Codigo Estudiante: " + this.codigo);
        System.out.println("Periodo Estudiante: " + this.periodo);
        System.out.println("Club Estudiante: " + this.club);
        System.out.println("Aso Estudiante: " + this.aso);

    }
}
