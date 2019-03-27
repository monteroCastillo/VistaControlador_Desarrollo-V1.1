
public class Cliente {
    
    private String codigo;
    private String nombre;
    private String sexo;
    private String telefono;

    public String getCodigo()	
	{ 
	  return codigo; 
	}

    public void setCodigo(String newCodigo)	{ this.codigo = newCodigo; }

    public String getNombre()  { return nombre; }
    public void setNombre(String newNombre){ this.nombre = newNombre; }

    public String getSexo()  { return sexo; }
    public void setSexo(String newSexo)  { this.sexo = newSexo; }

    public String getTelefono()  { return telefono; }
    public void setTelefono(String newTelefono)  { this.telefono = newTelefono; }

}
