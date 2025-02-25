package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    //Declaramos un libro como variable
    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    //Hacemos un setUp before para que nos cree libros antes de hacer cualquiera de los metodos
    //Cada vez que ejecutemos un test va a coger este libro
    @BeforeEach
    void setUp() {
        //inicializamos libro
        libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    @Test
    //este metodo lo que hacia era: devuelve un boolean
    /*public boolean agregarLibro(Libro libro) {
           return libros.add(libro);
      }
    */
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    @Test
    void eliminarLibro() {
    }

    @Test
    void getLibros() {
    }

    @Test
    void encuentraLibroPorTitulo() {
    }

    @Test
    void encuentaLibroPorAutor() {
    }
    //Nos pide que nos devuelva libros segun el autor
    @Test
    void encuentraLibrosPorAutor() {
        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(this.libro);
        // no está vacía
        assertNotNull(biblio.getLibros());
        // Sólo tiene un libro
        assertEquals(biblio.getLibros().size(), 1);
        // Contiene el libro recién añadido
        assertTrue(biblio.getLibros().contains(this.libro));
    }
}