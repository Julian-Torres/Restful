
package com.mycompany.restful;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import java.util.Arrays;
import java.util.Scanner;


import objects.Login;
import objects.Usuario;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;


public class Restful {
    
    private static final String URLogin="http://localhost:4000/login/ ";
    
    private static void Login (RestTemplate restTemplate){
            Login login= new Login("julis20002009@gmail.com","1234567");
                
                ResponseEntity<Login> response = restTemplate.postForEntity(URLogin,login, Login.class);
                
                    
                
                   var header = response.getBody();
                   
        //HttpEntity<String> entity = new HttpEntity<>(Usuario, header);
        //restTemplate.postForObject(URLogin, entity, String.class); 
   
                
              
                System.out.println();
                System.out.println("POST executed");
                System.out.println("POST StatusCode = " + response.getStatusCode());
                System.out.println();
                System.out.println("Header: "+ header);
                
        }
     
        
       private static final String URLUsuario="http://localhost:4000/usuario/ ";
       
           private static void getAllUsuarios(RestTemplate restTemplate) {
               
               //HttpEntity<String> entity = new HttpEntity<>("", header);
               //restTemplate.getForObject(URLUsuario, entity, Usuario[].class); 
        ResponseEntity<Usuario[]> response = restTemplate.getForEntity(URLUsuario, Usuario[].class);

        System.out.println();
        System.out.println("GET Body (object list): ");
        Arrays.asList(response.getBody()).forEach(info -> System.out.println("--> " + info));
    }
    
    

    public static void main(String[] args) throws JsonProcessingException {
        
         RestTemplate restTemplate = new RestTemplate();
         
         String token= "";
         
        //getAllUsuarios(restTemplate);
        Login(restTemplate);
    }
}
