
package com.example.CLibreria.Servicio;

import com.example.CLibreria.Entidad.CatalogoLibros;
import com.example.CLibreria.Repositorio.Repositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicioLibreria {
    //inyección de independencias
    @Autowired
    Repositorio rLibreria;
    
    //para consultar todos los libros
    public List<CatalogoLibros> obtenerLibros(){
        return rLibreria.findAll();
    }
    
    //insertar nuevos libros
    public boolean insertarLibro(CatalogoLibros a){
        boolean respuesta=false;
        
        try{
            rLibreria.save(a);
            respuesta = true;
        }catch(Exception e){
            respuesta = false;
        }
        return respuesta;
    }
    
    //actualizar datos de los libros
    public boolean actualizarLibro(CatalogoLibros a){
        boolean respuesta=false;
        
        try{
            rLibreria.save(a);
            respuesta = true;
        }catch(Exception e){
            respuesta = false;
        }
        return respuesta;
    }
    
    //eliminar libros del catalogo
    public boolean eliminarLibro(CatalogoLibros a){
        boolean respuesta=false;
        
        try{
            rLibreria.delete(a);
            respuesta = true;
        }catch(Exception e){
            respuesta = false;
        }
        return respuesta;
    }
}
