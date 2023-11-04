
package com.example.CLibreria.Repositorio;

import com.example.CLibreria.Entidad.CatalogoLibros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends JpaRepository<CatalogoLibros,Integer>{
    //
}
