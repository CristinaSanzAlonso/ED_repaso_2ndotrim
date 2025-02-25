package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca con una colección de libros
 * Permite agregar, eliminar y buscar libros por título y por autor
 *
 * @see Libro
 * @author Luis García
 * @version 4.3.2025
 */
public class Biblioteca {

    /* Comentario: Defino el atributo (privado y constante porque es final, es decir, no cambia)
     * que es una lista de libros disponibles en la biblioteca */
    /**
     * Lista de libros disponibles en la biblioteca
     * */
    private final List<Libro> libros;

    /** Constructor por defecto de la biblioteca sin libros */
    //Es constructor por defecto porque no recibe parametros
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    //Si recibe paramentros los tenemos de documentar con @param
    /** Constructor con parámetros.
     *
     * @param libros Lista de libros con la que se iniciliza la biblioteca
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }


    /**
     * Agrega un libro a la biblioteca
     * @param libro Un libro para agregar
     * @see Libro
     * @return {@code true} si el libro se ha agregado correctamente o {@code false} si el libro NO se ha agregado
     * correctamente
     */
    //@see Libro se refiere a la clase no al paramentro
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Devuelve la lista de libros de la biblioteca
     * @return lista de libros de la biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     *
     * @param titulo
     * @return
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * @deprecated  Este metodo ha quedado obsoleto
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)} en su lugar
     * @param autor
     * @return
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test 01: Comprobar la lista de libros que devuelve para un autor existente.
    //  Test 02: Comprobar la lista de libros que devuelve para un autor NO existente

    /**
     * Busca todos los libros de un autor determinado
     * @since V2.0
     * Sustituye al metodo {@link #encuentraLibroPorTitulo(String)}
     * @param autor
     * @return
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}