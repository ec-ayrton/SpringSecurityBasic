package com.ayrton.app.security;

import com.ayrton.app.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails usuario = usuarioRepository.findByUsuario(username).orElseThrow(()->new UsernameNotFoundException("Usuario com esser username não encontrado."));
        return new User(usuario.getUsername(),usuario.getPassword(),true,true,true,true,usuario.getAuthorities());
    }
}
