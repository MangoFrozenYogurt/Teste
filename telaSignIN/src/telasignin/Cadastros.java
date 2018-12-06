/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasignin;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author fabricio.jc
 */
public class Cadastros {
    ArrayList<Usuario> users = new ArrayList();
    
    public Usuario searchByName(String name){
        for(Iterator iter = users.iterator(); iter.hasNext();){
            Usuario aux = (Usuario) iter.next();
            if(aux.getName().equals(name)){
                return aux;
            }
        }
        return null;
    }
}
