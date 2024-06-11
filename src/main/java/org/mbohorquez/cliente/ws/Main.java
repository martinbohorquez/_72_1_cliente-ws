package org.mbohorquez.cliente.ws;

import org.mbohorquez.webapp.jaxws.services.Curso;
import org.mbohorquez.webapp.jaxws.services.ServicioWs;
import org.mbohorquez.webapp.jaxws.services.ServicioWsImplService;

public class Main {
    public static void main(String[] args) {
        ServicioWs service = new ServicioWsImplService().getServicioWsImplPort();
        System.out.println("El saludo: " + service.saludar("Katherine"));

        Curso curso = new Curso();
        curso.setNombre("react");
        Curso respuesta = service.crear(curso);
        System.out.println("nuevo curso: " + curso.getNombre());

        service.listar().forEach(c -> System.out.println(c.getNombre()));

    }
}
