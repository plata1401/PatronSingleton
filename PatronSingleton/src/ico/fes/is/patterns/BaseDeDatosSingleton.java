/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.patterns;

/**
 *
 * @author plats
 */
public class BaseDeDatosSingleton {
    private String url;
    private String user;
    private String password;
    private String nombreBd;
    private String port;
    private static BaseDeDatosSingleton _instance;

    public BaseDeDatosSingleton() {
        System.out.println("Conectando a Bd");
        
    }

    private BaseDeDatosSingleton(String url, String user, String password, String nombreBd, String port) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.nombreBd = nombreBd;
        this.port = port;
    }
    
    public static BaseDeDatosSingleton getInstance (){
        // implementa singleton
        if(_instance == null){
            _instance = new BaseDeDatosSingleton();
        }else{
            System.out.println("Ya fue instanciada...");           
        }
        return _instance;
        
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreBd() {
        return nombreBd;
    }

    public void setNombreBd(String nombreBd) {
        this.nombreBd = nombreBd;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
    
    public void consultarClientes (){//simular consulta SQL
        System.out.println("Id\tnombre\ttelefono");
        System.out.println("1\tJose\t55443322112");
        System.out.println("2\tDiana\t5517394985");
        System.out.println(this);
                
        
    }
            
    
    
}
