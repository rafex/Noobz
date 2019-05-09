package mx.rafex.noobz.cli.sesiones;

import mx.rafex.noobz.cli.dtos.personas.PersonaCliDto;
import mx.rafex.noobz.cli.dtos.usuarios.UsuarioCliDto;

public class RegistroCli {

    private PersonaCliDto persona;
    private UsuarioCliDto usuario;

    public Boolean registra(final PersonaCliDto persona, final UsuarioCliDto usuario) {
        this.persona = persona;
        this.usuario = usuario;

        return false;
    }

}
