/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasignin;

/**
 *
 * @author fabricio.jc
 */
public class Usuario {
    public String nome;
    private String email;
    private String senha;
    public int idx;
    
    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public boolean comparePasswords(String senha){
        if(this.senha.equals(senha)){
            return true;
        }else{
            return false;
        }
    }
    
    public String getName(){
        return this.nome;
    }
}
