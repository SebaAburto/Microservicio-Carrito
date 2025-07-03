package com.carrito.carrito.Service;

import com.carrito.carrito.model.Usuario;
import com.carrito.carrito.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) throws Exception {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new Exception("Usuario no encontrado con id: " + id));
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id) throws Exception {
        if (!usuarioRepository.existsById(id)) {
            throw new Exception("Usuario no encontrado con id: " + id);
        }
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> buscarPorRun(String run) {
        return usuarioRepository.findByRun(run);
    }
}
