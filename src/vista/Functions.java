/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import static alerta.InsertSeach.txt_inserach;
import static alerta.Replacetxt.txt_inreplace;
import static alerta.Replacetxt.txt_inreplace1;
import java.awt.Color;
import java.awt.List;
import java.text.Normalizer;
import java.util.ArrayList;

/**
 *
 * @author Josafat bk
 */
public class Functions {
    
     public static void Repa(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
      // System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
      // System.out.print(times);
       frm_principal.lbl_rep_A.setText(Integer.toString(times));
       
   }
      public static void Repe(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
      //  System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
   //    System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       frm_principal.lbl_rep_E.setText(Integer.toString(times));
       
   }
      
       public static void Repi(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
     //   System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
     //  System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       frm_principal.lbl_rep_I.setText(Integer.toString(times));
       
   }
       
        public static void Repo(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
     //   System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
     //  System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       frm_principal.lbl_rep_O.setText(Integer.toString(times));
       
   }
        
         public static void Repu(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
      //  System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
      // System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       frm_principal.lbl_rep_U.setText(Integer.toString(times));
       
   }
         
         public static void PAR(String valor){
             String[] valorarray = valor.split(" ");
             int sumPar=0;
             int sumImp=0;
             
             
             for (int i = 0; i < valorarray.length; i++){
            String palabra = valorarray[i];
            // System.out.println(palabra);
            int cont = palabra.length();
            //System.out.println(cont);
            
            if (cont % 2 == 0 ){
                sumPar = sumPar + 1;
                
            }else {
                sumImp = sumImp + 1;
            }
            
        }
            
             frm_principal.lbl_cantidad_par.setText(Integer.toString(sumPar));
             frm_principal.lbl_cantidad_impar.setText(Integer.toString(sumImp));
         }
         
         
          public static void Buscar(){
              
              String valor = frm_principal.txt_entrada.getText();
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
       
       String find = txt_inserach.getText();
      
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(find)){
               times++;
               
           }
       }
       System.out.println(times);
       alerta.InsertSeach.lbl_conc.setText(Integer.toString(times));
       


          }
          
          public static void replace(){
       
   
   String valor = frm_principal.txt_entrada.getText();
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
       
       String find = txt_inreplace.getText();
       String rep = txt_inreplace1.getText();
       
    
       
       for (int i = 0; i <find.length(); i++){
          // s = s.replace(abecedario[i], traductor[i]);
           s = s.replace(find, rep);
       }
       frm_principal.txt_entrada.setText(s);
    
   }
         
         
    
}
