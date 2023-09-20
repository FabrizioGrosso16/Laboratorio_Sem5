/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author User001
 */
public class Estudiante {
    String nombre;
    String apellido;
    String codigo;
    String Texto;
    public Estudiante(String nombre, String apellido, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }
    
      public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCodigo() {
        return codigo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
     
}
