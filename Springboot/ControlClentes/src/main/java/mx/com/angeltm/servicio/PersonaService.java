package mx.com.angeltm.servicio;

import java.util.List;

import mx.com.angeltm.domain.Persona;

public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
