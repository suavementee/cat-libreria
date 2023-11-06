
package com.example.CLibreria.Controlador;

import com.example.CLibreria.Entidad.CatalogoLibros;
import com.example.CLibreria.Servicio.ServicioLibreria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController //anotación que indica que la clase se trata de un controlador
@RequestMapping("/catalogo") //
public class ControladorLibreria {
    
    @Autowired
    ServicioLibreria sLibreria;
    
    @GetMapping("")
    public List<CatalogoLibros> getLibros(){
        return sLibreria.obtenerLibros();
    }
    
    @PostMapping("")
    public List<CatalogoLibros> postInsertarLibros (@RequestBody CatalogoLibros a){
        if(sLibreria.insertarLibro(a)){
            return sLibreria.obtenerLibros();
        }else{
            return null;
        }
    }
    
    @PutMapping("")
    public List<CatalogoLibros> putActualizarLibros (@RequestBody CatalogoLibros a){
        if(sLibreria.actualizarLibro(a)){
            return sLibreria.obtenerLibros();
        }else{
            return null;
        }
    }
    
    @DeleteMapping("")
    public List<CatalogoLibros> deleteLibros (@RequestBody CatalogoLibros a){
        if(sLibreria.eliminarLibro(a)){
            return sLibreria.obtenerLibros();
        }else{
            return null;
        }
    }
}
