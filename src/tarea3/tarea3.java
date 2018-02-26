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
        int opcion;//variable que utliza el switch del menu
        do{//para que el menu se navegable y se repita
            Scanner sn=new Scanner(System.in);//captura de teclado 
            //menu principal
            System.out.println("[IPC1]Tarea3_210700339");
            System.out.println("");
            System.out.println("1.Usuarios");
            System.out.println("2.Contador de dígitos");
            System.out.println("3.Tres números de mayor a menor");
            System.out.println("4.Calcular promedio");
            System.out.println("5.Salir");
            System.out.println("Introduzca el número de la opción que desee");
            opcion=sn.nextInt();
            switch (opcion){//switch que contendra las opciones del menu principal
                case 1://opcion usuarios
                    int opcion3;//variable que uitiliza el switch del munu usuarios
                    String[]persona=new String[5];//string donde se guardaran los usuarios
                    do{//menu de usuarios
                        System.out.println("1.Ingresar usuario");
                        System.out.println("2.Mostrar Usuarios ascendentes");
                        System.out.println("3.Mostrar Usuarios descententes");
                        System.out.println("4.Menú principal");
                        opcion3=sn.nextInt();
                        switch(opcion3){//switch anidado para navegar por el submenu
                            case 1://ingreso de usuarios
                                for(int i=0;i<persona.length;i++){
                                    System.out.println("ingrese el nombre");
                                    persona[i]=sn.next();//captura de usuario
                                    //comprobacion de usuarios repetidos y reasignacion  
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
                            case 2://impresion en forma descendente  
                                for(int i=4;i>=0;i--){
                                    System.out.println(persona[i]);
                                }
                                break;
                            case 3://impresion en forma ascendente
                                for(int i=0;i<persona.length;i++){
                                    System.out.println(persona[i]);
                                }
                                break;
                        }
                    }while(opcion3>0 && opcion3<4);//condicion para volver al submenu
                    break;
                case 2://opcion contador de digitos
                        int opcion1;//variable que utiliza el switch del submenu
                        int numd = 0;//se inicializo la variable
                        int contador=0;//contador de digitos
                        do{//menu de contador de digitos
                            System.out.println("1.Ingresar número");
                            System.out.println("2.Mostrar número de digitos");
                            System.out.println("3.menú principal");
                            System.out.println("Introduzca el número de la opción que desee");
                            opcion1=sn.nextInt();
                            switch(opcion1){//switch anidado para sub menu
                                case 1://ingreso de numero
                                System.out.println("Introduzca el número");
                                numd=sn.nextInt();//captura de numero
                                while(!(numd>=0 && 100000>=numd)){//rango de numeros
                                    System.out.println("Numero fuera de rango");
                                    System.out.println("Ingrese otro numero");//reasignacion
                                    numd=sn.nextInt();
                                }
                                    break;
                                case 2://numero de digitos                                                                                   
                                    do{//ciclo para contar digitos
                                    numd=(numd/10);
                                    contador=contador+1;
                                    }while(numd>0);
                                    System.out.println("El numero de digitos es "+contador);
                                    break;
                            }
                        }while(opcion1>0 && opcion1<3);//condicion para volver al submenu
                    break;
                case 3://ordenar tres numeros
                    int va1=0;//numero 1
                    int va2=0;//numero 2
                    int va3=0;//numero 3
                    int opcion2;//variable con la que sea opera  el switch del submenu
                    do{//menu ordenar tres numeros
                        System.out.println("1.Ingresar números");
                        System.out.println("2.mostrar ordenados");
                        System.out.println("3.Menú principal");
                        opcion2=sn.nextInt();
                        switch(opcion2){//switch anidado para submenu
                            case 1://ingresar los tres numeros
                                System.out.println("Introdusca los números");
                                va1=sn.nextInt();//asignacion 1
                                va2=sn.nextInt();//asignacion 2
                                va3=sn.nextInt();//asignacion 3
                                break;
                            case 2://ordenar los numeros mayor a menor
                                //condicones para ordenar
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
                    }while(opcion2>0 && opcion2<3);//condicon para volver al submenu
                    break;
                case 4://promedio de notas
                    int matriz[][]=new int[6][6];
                    int menu4;//variable con la que se opera el switch del submenu
                    do{//menu promedio
                        System.out.println("1.Ingrese ID y notas");
                        System.out.println("2.promedio");
                        System.out.println("3.Menú principal");
                        menu4=sn.nextInt();
                        switch(menu4){//switch anidado para navegar en el sub menu
                            case 1://ingreeso de id y notas
                                for(int i=0;i<matriz.length;i++){
                                    for(int j=0;j<matriz[0].length;j++){
                                        if(j<=0){//ingreso de ID
                                            System.out.println("ingrese ID de la clase");
                                            matriz[i][j]=sn.nextInt();
                                        }else if(j>0 && j<5){//ingreso de notas
                                            System.out.println("ingrese las notas");
                                            matriz[i][j]=sn.nextInt();
                                        }else if(j>4){//calculo del promedio por clase
                                            matriz[i][j]=(matriz[i][1]+matriz[i][2]+matriz[i][3]+matriz[i][4])/4;
                                        }
                                    }
                                }
                                break;
                            case 2://impresion de matriz con promedio de notas        
                                for(int i=0;i<matriz.length;i++){
                                    for(int j=0;j<matriz[0].length;j++){
                                        System.out.print(matriz[i][j]+"\t");    
                                    }
                                    System.out.println("");
                                }
                        }
                    }while(menu4>0 && menu4<3);//condicion para regresar al submenu
                    break;
            }
        }while(opcion>0 && opcion<5);//condicon para volver al menu principal
    }
}
