package codoacodo.actividadobligatoriajava2;

public class Usuario {

    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String editorCodigo;
    private String SistemaOperativo;

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getEditorCodigo() {
        return editorCodigo;
    }

    public void setEditorCodigo(String editorCodigo) {
        this.editorCodigo = editorCodigo;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String SistemaOperativo) {
        this.SistemaOperativo = SistemaOperativo;
    }

    @Override
    public String toString() {
        return "El Usuario se llama: " + nombre + " " + apellido + ", tiene " + edad + " años de edad, le gusta " + hobbie + ", su editor de código preferido es " + editorCodigo + ", y el sistema operativo que utiliza es " + SistemaOperativo + ".";
    }
    
    

}
