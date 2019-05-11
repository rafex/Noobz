package mx.rafex.noobz.daos.usuarios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mx.rafex.noobz.daos.dtos.usuarios.UsuarioDto;

class TestUsuarioDaoImpl {

    UsuarioDao usuarioDao = new UsuarioDaoImpl();

    @DisplayName("Prueba de insertar un nuevo usuario a la tabla")
    @Test
    void pruebaInsercionUsuario() {

        final UsuarioDto usuario = new UsuarioDto();
        usuario.setAlias("Abel");
        usuario.setCorreoElectronico("abel@gmail.com");
        usuario.setContrasenya("43443");
        final UsuarioDto resultado = this.usuarioDao.crear(usuario);

        assertNotNull(resultado, "fallo");
        assertNotNull(resultado.getId(), "fallo");

        System.out.println("Id: " + resultado.getId());
        System.out.println("Alias: " + resultado.getAlias());
    }

    @DisplayName("Prueba de traer todos los usuarios de la tabla")
    @Test
    void pruebaDeTraerTodosLosUsuariosDeLaTabla() {

        this.usuarioDao.todos();
    }

}
