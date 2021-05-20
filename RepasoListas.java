import java.util.*;
public class RepasoListas
{
    public static void main(String[] args){
        int num_primo=2;
        int num_buscar = 0;
        int tamanio =0;
        Scanner entrada = new Scanner(System.in);
        int milista[] = new int[5];
        milista[0] = 8;
        milista[1] = 1;
        milista[2] = 10;
        milista[3] = 0;
        milista[4] = 50;
        
        System.out.println("Ingrese el valor a eliminar");
        num_buscar = entrada.nextInt();
        setEliminarElemento(milista, num_buscar);
        //System.out.println(getPrimosLista(milista));
        //System.out.println("Ingrese el tamaño de la lista");
        //tamanio = entrada.nextInt();
        //int lista_num[] = new int[tamanio];
        
        /*
        while(num_primo > 1){
            System.out.println("Ingrese el numero para saber si es primo o no");
            num_primo = entrada.nextInt();
            System.out.println(getPrimo(num_primo));
            System.out.println("Para continuar ingrese un numero mayor a 1");
            num_primo = entrada.nextInt();
        }
        System.out.println("Ha salido del programa");
        */
        
        //setIngresarValores(lista_num); 
        
        //getPrimosLista(lista_num);
        /*
        setOrdenarLista(milista);
        System.out.println("Ingrese el numero a buscar");
        num_buscar = entrada.nextInt();
        setInsertNum(milista, num_buscar);
        */
        //System.out.println(getBusquedaLista(lista_num, num_buscar));
        
    }
    
    static void setIngresarValores(int[] lista){
        Scanner entrada2 = new Scanner(System.in);
        int valores = 0;
        for(int i=0 ; i<lista.length ; i++){
            System.out.println("Ingrese valores a la lista");
            lista[i] = entrada2.nextInt();
        }
        for(int i=0 ; i<lista.length ; i++){
            System.out.println(lista[i]);
        }
    }
    
    static void setOrdenarLista(int[] lista2){
        int aux = 0;
        for(int n=0 ; n<lista2.length-1 ; n++){
            for(int m=n+1 ; m<lista2.length ; m++){
                if(lista2[n] > lista2[m]){
                    aux = lista2[n];
                    lista2[n] = lista2[m];
                    lista2[m] = aux;
                }
            }
        }
        for(int i=0 ; i<lista2.length ; i++){
            System.out.println(lista2[i]);
        }
    }
    
    static String getBusquedaLista(int[] lista3, int num){
        int contador = 0;
        int bandera = 0;
        for(int i=0 ; i<lista3.length ; i++){
            if(num == lista3[i]){
                bandera = 1;
                contador +=1;
            }
        }
        System.out.println("La cantidad de veces que se repite el numero es:"+contador);
        
        if(bandera == 1){
            return "El numero ingresado esta en la lista";
        }
        else{
            return "El numero ingresado no esta en la lista";
        }
    }
    
    static int getPrimo(int num){
        int resto = 0;
        int bandera = 0;
        if(num <= 1){
            bandera = 1;
        }
        else if(num == 2){
            bandera = 0;
        }
        else{
            for(int i=2 ; i<num ; i++ ){
                resto = num % i;    
                if(resto == 0){
                    bandera = 1;
                }
            }
        }
        return bandera;
        /*
        if (bandera == 1){
            return bandera;
        }
        else{
            return bandera;
        }
        */
    }

    static String getPrimosLista(int[] lista4){ 
        int cont_primos = 0;
        int primo = 0;
        for (int i=0 ; i < lista4.length ; i++){
            if(lista4[i]>1){
                primo = getPrimo(lista4[i]);
                if(primo == 0){
                    cont_primos += 1;
                }
            }
        }
        return "La cantidad de elementos primos son "+cont_primos;
    }
    
    static void setInsertNum(int[] lista5, int numi){
        int bandera;
        int pos = 0;
        int aux = 0;
        int aux1 = 0;
        
        for (int i=0 ; i < lista5.length-1 ; i++){
            if(numi > lista5[i] && numi < lista5[i+1]){
                bandera = 1;
                pos = i+1;
            }   
        }
        for (int i= lista5.length-1 ; i >=pos ; i--){
            if(i==pos){
                lista5[i] = numi;
            }
            else{
                lista5[i] = lista5[i-1];
            }
        }
        for (int i=0 ; i <lista5.length ; i++){
            System.out.println(lista5[i]);
        } 
    }
    
    static void setEliminarElemento(int[] lista6, int num_e){
        int posic=0;
        for (int i=0 ; i <lista6.length-1 ; i++){
            if(num_e == lista6[i]){
                posic = i;
            }
        }
        for (int i=posic ; i <lista6.length-1 ; i++){
            lista6[i] = lista6[i+1];
        }
        for (int i=0 ; i <lista6.length ; i++){
            System.out.println(lista6[i]);
        }
        
    }
}
