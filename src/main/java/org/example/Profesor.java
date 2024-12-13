package org.example;

public class Profesor extends ComunidadEPN{
    private String materiasDictadas;
    private String facultad;
    private String tipoContrato;

    public Profesor() {
    }

    public Profesor(String cedula, String nombre, int edad, String direccion, String telefono, String correo, String materiasDictadas, String facultad, String tipoContrato) {
        super(cedula, nombre, edad, direccion, telefono, correo);
        this.materiasDictadas = materiasDictadas;
        this.facultad = facultad;
        this.tipoContrato = tipoContrato;
    }

    public String getMateriasDictadas() {
        return materiasDictadas;
    }

    public void setMateriasDictadas(String materiasDictadas) {
        this.materiasDictadas = materiasDictadas;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    //metodos personalizados

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("materias dictadas: " + this.materiasDictadas);
        System.out.println("facultad: " + this.facultad);
        System.out.println("tipoContrato: " + this.tipoContrato);
    }

}
