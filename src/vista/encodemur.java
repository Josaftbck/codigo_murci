/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.text.Normalizer;

/**
 *
 * @author Josafat bk
 */
public class encodemur {

   public static void Encode(String valor){
       
   
   
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
       
       String av="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
       String tr="7,B,3,D,5,F,8,H,4,J,K,6,0,N,9,P,Q,2,S,T,1,V,W,X,Y,Z";
       String[] abc = av.split(",");
       String[] traductor= tr.split(",");
       
       for(int i=0; i < abc.length; i++){
        System.out.println(abc[i]);
        }
       
       for(int i=0; i < traductor.length; i++){
        System.out.println(traductor[i]);
        }
       
       for (int i = 0; i <26; i++){
           s = s.replace(abc[i], traductor[i]);
       }
       frm_principal.txt_salida.setText(s);
    
   }
   
   
   public static void Decode(String valor){
       
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
       
       String av="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
       String tr="7,B,3,D,5,F,8,H,4,J,K,6,0,N,9,P,Q,2,S,T,1,V,W,X,Y,Z";
       String[] abc = av.split(",");
       String[] traductor= tr.split(",");
       
       for(int i=0; i < abc.length; i++){
        System.out.println(abc[i]);
        }
       
       for(int i=0; i < traductor.length; i++){
        System.out.println(traductor[i]);
        }
       
       for (int i = 0; i <26; i++){
           s = s.replace(traductor[i], abc[i]);
       }
       frm_principal.txt_salida.setText(s);
       
   }
    
}
