package mx.rafex.noobz.daos.usuarios;

import mx.rafex.noobz.daos.dtos.usuarios.UsuarioDto;

public interface UsuarioDao {

    UsuarioDto buscar(UsuarioDto usuario);

    UsuarioDto crear(UsuarioDto usuario);

}
