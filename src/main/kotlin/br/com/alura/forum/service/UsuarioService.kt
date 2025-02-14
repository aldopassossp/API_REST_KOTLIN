package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.Arrays

@Service
class UsuarioService(var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(
            id = 1,
            nome = "Aldo",
            email = "aldopassos@gmail.com"
        )
        usuarios = Arrays.asList(usuario)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter({
                u -> u.id == id
        }).findFirst().get()
    }
}