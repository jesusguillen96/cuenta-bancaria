/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author Jesus
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String fecha;
    private String direccion;
    private String ocupacion;
    private String email;
    private String telefono;
   public Cliente ( String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
  public void setnombre(String nombre){
       this.nombre=nombre;
  }
  public String getnombre(){
      return nombre;
  }
  public void setapellido(String apellido){
      this.apellido=apellido;
  }
public String getapellido(){
    return apellido;
}
public void setfecha(String fecha){
    this.fecha = fecha;
}
public String getfecha(){
    return fecha;
}
public void setdirreccion(String direccion){
    this.direccion = direccion;
}
public String getdireccion(){
    return direccion;
}
public void setocupacion(String ocupacion){
    this.ocupacion = ocupacion;
}
public String getocupacion(){
    return ocupacion;
}
public void setemail(String email){
    this.email = email;
}
public String getemail(){
    return email;
}
public void settelefono(String telefono){

   }     

    void setdireccion(String _Avenida_Siempreviva_742) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
        
    }

