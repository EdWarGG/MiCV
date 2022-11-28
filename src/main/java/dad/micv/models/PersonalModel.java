package dad.micv.models;

import java.time.LocalDate;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

public class PersonalModel {
	
	private StringProperty identificacion = new SimpleStringProperty();
	private StringProperty nombre = new SimpleStringProperty();
	private StringProperty apellidos = new SimpleStringProperty();
	private ObjectProperty<LocalDate> fechaNacimiento = new SimpleObjectProperty<LocalDate>();
	private StringProperty direccion = new SimpleStringProperty();
	private StringProperty codigoPostal = new SimpleStringProperty();
	private StringProperty localidad = new SimpleStringProperty();
	private StringProperty pais = new SimpleStringProperty();
	private ListProperty<String> nacionalidad = new SimpleListProperty<>(FXCollections.observableArrayList());

    
    public StringProperty identificacionProperty() {
        return identificacion;
    }
    public String getIdentificacion() {
        return identificacion.get();
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion.set(identificacion);
    }
    
    
    
    public StringProperty nombreProperty() {
        return nombre;
    }
    public String getNombre() {
        return nombre.get();
    }
    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }
    
    
    
    public StringProperty apellidosProperty() {
        return apellidos;
    }
    public String getApellidos() {
        return apellidos.get();
    }
    public void setApellidos(String apellidos) {
        this.apellidos.set(apellidos);
    }
    
    
    
    public ObjectProperty<LocalDate> fechaNacimientoProperty() {
        return fechaNacimiento;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento.get();
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento.set(fechaNacimiento);
    }
    
    
    
    public StringProperty direccionpProperty() {
        return direccion;
    }
    public String getDireccion() {
        return direccion.get();
    }
    public void setDireccion(String direccion) {
        this.direccion.set(direccion);
    }
    
    
    
    public StringProperty codigoPostalProperty() {
        return codigoPostal;
    }
    public String getCodigoPostal() {
        return codigoPostal.get();
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal.set(codigoPostal);
    }
    
    
    
    public StringProperty localidadProperty() {
        return localidad;
    }
    public String getLocalidad() {
        return localidad.get();
    }
    public void setLocalidad(String localidad) {
        this.localidad.set(localidad);
    }
    
    
    
    public StringProperty paisProperty() {
        return pais;
    }
    public String getPais() {
        return pais.get();
    }
    public void setPais(String pais) {
        this.pais.set(pais);
    }
    
    
    
    public ListProperty<String> nacionalidadProperty() {
        return nacionalidad;
    }
    public Nacionalidad[] getNacionalidad() {
        return (Nacionalidad[]) (nacionalidad.toArray());
    }
    public void setNacionalidad(String newNacionalidad) {
        nacionalidad.add(new Nacionalidad(newNacionalidad).getDenominacion());
    }

}
	
	

