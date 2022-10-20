package com.nil.web.api.repository;

import com.nil.web.api.handler.BusinessException;
import com.nil.web.api.handler.CampoObrigatorioException;
import com.nil.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if (usuario.getLogin()==null)
            throw new CampoObrigatorioException("login");

        if (usuario.getPassword()==null)
            throw new CampoObrigatorioException("password");


        if(usuario.getId()==null)
            throw new BusinessException("Save - Recebendo o usuário na camada de repositório");
        else
            System.out.println("Update - Recebendo o usuário na camada de repositório");
    }
    
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Nil","password"));
        usuarios.add(new Usuario("Pedro","masterpass"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("Nil","password");
    }

}