/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import service.crud.Impl.crudBerryImpl;
import service.crud.crudBerry;

@Configurable
public class AppConfig {
    
    @Bean (name="crudBerry")
    public crudBerry getCrudBerry (){
        return new crudBerryImpl();}
    
    
    
}
