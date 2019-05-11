package mx.rafex.noobz.daos.usuarios;

import java.util.List;

import mx.rafex.noobz.daos.dtos.usuarios.UsuarioDto;

public interface UsuarioDao {

    UsuarioDto buscar(UsuarioDto usuario);

    UsuarioDto crear(UsuarioDto usuario);

    List<UsuarioDto> todos();

}
