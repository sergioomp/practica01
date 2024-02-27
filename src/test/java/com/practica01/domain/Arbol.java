
package com.practica01.domain;

import java.io.Serializable;
import lombok.Data;
import jakarta.persistence.*;

/**
 *
 * @author andre
 */
@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {
    

    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_arbol")
    
    private Long idArbol;
    private String tipo;
    private String rutaImagen;
    private String flor;
    private boolean activo;

}

  