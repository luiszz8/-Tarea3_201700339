/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){  
        int opcion;
        do{
            Scanner sn=new Scanner(System.in);
            
            System.out.println("[IPC1]Tarea3_210700339");
            System.out.println("");
            System.out.println("1.Usuarios");
            System.out.println("2.Contador de dígitos");
            System.out.println("3.Tres números de mayor a menor");
            System.out.println("4.Calcular promedio");
            System.out.println("5.Salir");
            System.out.println("Introduzca el número de la opción que desee");
            opcion=sn.nextInt();
            switch (opcion){
                case 1:
                    int opcion3;
                    String[]persona=new String[5];
                    do{
                        System.out.println("1.Ingresar usuario");
                        System.out.println("2.Mostrar Usuarios ascendentes");
                        System.out.println("3.Mostrar Usuarios descententes");
                        System.out.println("4.Menú principal");
                        opcion3=sn.nextInt();
                        switch(opcion3){
                            case 1:
                                for(int i=0;i<persona.length;i++){
                                    System.out.println("ingrese el nombre");
                                    persona[i]=sn.next();
                                    if(persona[i].equals(persona[0]) && i!=0){
                                        System.out.println("persona ya ingresada");
                                        System.out.println("ingrese otro usuario");
                                        persona[i]=sn.next();
                                    }else if(persona[i].equals(persona[1]) && i!=1){
                                        System.out.println("persona ya ingresada");
                                        System.out.println("ingrese otro usuario");
                                        persona[i]=sn.next();
                                    }else if(persona[i].equals(persona[2]) && i!=2){
                                        System.out.println("persona ya ingresada");
                                        System.out.println("ingrese otro usuario");
                                        persona[i]=sn.next();
                                    }else if(persona[i].equals(persona[3]) && i!=3){
                                        System.out.println("persona ya ingresada");
                                        System.out.println("ingrese otro usuario");
                                        persona[i]=sn.next();
                                    }else if(persona[i].equals(persona[4]) && i!=4){
                                        System.out.println("usuario ya ingresado");
                                        System.out.println("ingrese otro usuario");
                                        persona[i]=sn.next();
                                    }
                                }
                                break;
                            case 2:  
                                for(int i=4;i>=0;i--){
                                    System.out.println(persona[i]);
                                }
                                break;
                            case 3:  
                                for(int i=0;i<persona.length;i++){
                                    System.out.println(persona[i]);
                                }
                                break;
                        }
                    }while(opcion3<4);
                    break;
                case 2:
                        int opcion1;
                        int numd = 0;
                        int contador=0;
                        Scanner sn2=new Scanner(System.in); 
                        do{
                            System.out.println("1.Ingresar número");
                            System.out.println("2.Mostrar número de digitos");
                            System.out.println("3.menú principal");
                            System.out.println("Introduzca el número de la opción que desee");
                            opcion1=sn2.nextInt();
                            switch(opcion1){
                                case 1:
                                Scanner sn3=new Scanner(System.in); 
                                System.out.println("Introduzca el número");
                                numd=sn3.nextInt();
                                while(!(numd>=0 && 100000>=numd)){
                                    System.out.println("Numero fuera de rango");
                                    System.out.println("Ingrese otro numero");
                                    numd=sn.nextInt();
                                }
                                 
                                    break;
                                case 2:                                                                                   
                                    do{
                                    numd=(numd/10);
                                    contador=contador+1;
                                    }while(numd>0);
                                    System.out.println("El numero de digitos es "+contador);
                                    break;
                                case 3:
                                    break;
                            }
                        }while(opcion1<3);
                    break;
                case 3:
                    int va1=0;
                    int va2=0;
                    int va3=0;
                    int opcion2;
                    Scanner sn4=new Scanner(System.in);
                    do{
                        System.out.println("1.Ingresar números");
                        System.out.println("2.mostrar ordenados");
                        System.out.println("3.Menú principal");
                        opcion2=sn4.nextInt();
                        switch(opcion2){
                            case 1:
                                Scanner sn5=new Scanner(System.in);
                                Scanner sn6=new Scanner(System.in);
                                Scanner sn7=new Scanner(System.in);
                                System.out.println("Introdusca los números");
                                va1=sn5.nextInt();
                                va2=sn6.nextInt();
                                va3=sn7.nextInt();
                                break;
                            case 2:
                                if(va1>=va2 && va2>=va3){
                                    System.out.println("El orden de los números es:");
                                    System.out.println(va1);
                                    System.out.println(va2);
                                    System.out.println(va3);
                                }else if(va1>=va3 && va3>=va2){
                                    System.out.println("El orden de los números es:");
                                    System.out.println(va1);
                                    System.out.println(va3);
                                    System.out.println(va2);
                                    }else if(va2>=va1 && va1>=va3){
                                        System.out.println("El orden de los números es:");
                                        System.out.println(va2);
                                        System.out.println(va1);
                                        System.out.println(va3);
                                        }else if(va2>=va3 && va3>=va1){
                                            System.out.println("El orden de los números es:");
                                            System.out.println(va2);
                                            System.out.println(va3);
                                            System.out.println(va1);
                                            }else if(va3>=va1 && va1>=va2){
                                                System.out.println("El orden de los números es:");
                                                System.out.println(va3);
                                                System.out.println(va1);
                                                System.out.println(va2);
                                                }else{
                                                    System.out.println("El orden de los números es:");
                                                    System.out.println(va3);
                                                    System.out.println(va2);
                                                    System.out.println(va1);
                                                }
                                break;
                        }
                    }while(opcion2<2);
                    break;
                case 4:
                    int nota;
                    int matriz[][]=new int[6][6];
                    int menu4;
                    do{
                        System.out.println("1.Ingrese ID y notas");
                        System.out.println("2.promedio");
                        System.out.println("3.Menú principal");
                        menu4=sn.nextInt();
                        switch(menu4){
                            case 1:
                                for(int i=0;i<matriz.length;i++){
                                    for(int j=0;j<matriz[0].length;j++){
                                        if(j<=0){
                                            System.out.println("ingrese ID de la clase");
                                            matriz[i][j]=sn.nextInt();
                                        }else if(j>0 && j<5){
                                            System.out.println("ingrese las notas");
                                            matriz[i][j]=sn.nextInt();
                                        }else if(j>4){
                                            matriz[i][j]=(matriz[i][1]+matriz[i][2]+matriz[i][3]+matriz[i][4])/4;
                                        }
                                    }
                                }
                                break;
                            case 2:        
                                for(int i=0;i<matriz.length;i++){
                                    for(int j=0;j<matriz[0].length;j++){
                                        System.out.print(matriz[i][j]+" ");    
                                    }
                                    System.out.println("");
                                }
                        }
                    }while(menu4<3);
                    break;
                case 5:
                    break;
            }
        }while(opcion<5);    
    }
}
