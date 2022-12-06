
package objects;

public class Login {
   
    private String email;
    private String contrasena;
    private String token;

    public Login(String email, String contrasena) {
        this.email=email;
        this.contrasena=contrasena;
    }
    
    public Login(String token) {
        this.token=token;
    }
    
     public Login() {
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
        @Override
    public 
        String toString() {
        return token;
    }
    

  
}