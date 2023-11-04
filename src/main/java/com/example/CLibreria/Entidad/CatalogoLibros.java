
package com.example.CLibreria.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //una entidad por tabla
@Table (name="catalogo")
public class CatalogoLibros {
    /*
        Almacenar para cada libro:
            Nombre del libro
            Autor
            Número de páginas
            Editorial
            Idioma
    
        Incluir el CRUD:
            Consultar libros disponibles
            Agregar nuevos libros
            Eliminar libros
            Actualizar los datos de los libros
    */
    
    @Id
    private int id;
    
    @Column(length = 50)
    private String nombreLibro;
    private String autorLibro;
    private int numPaginas;
    private String editorial;
    private String idioma;
    
    // metodos constructores y sobrecarga
    public CatalogoLibros(int id, String nombreLibro, String autorLibro, int numPaginas, String editorial, String idioma) {
        this.id = id;
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.numPaginas = numPaginas;
        this.editorial = editorial;
        this.idioma = idioma;
    }
    
    public CatalogoLibros() {
        
    }
    
    // setters y getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
}

