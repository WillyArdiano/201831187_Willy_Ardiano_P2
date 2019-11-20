
package proyecto2_lfydp.Backend;

public class Verificador {
    
    int [] estadosValidados={Estado.S1,Estado.S3,Estado.S4,Estado.S5,Estado.S7,Estado.S10,Estado.S11,Estado.S15,Estado.S16,Estado.S17};
    
    public int verificarCaracter(String caracter){
        if(esNumero(caracter)){
            return Lenguaje.NUMERO;
        }else if(esPunto(caracter)){
            return Lenguaje.PUNTO;
        }if(esLetra(caracter)){
            return Lenguaje.LETRA;            
        }if(esEpsilon(caracter)){
            return Lenguaje.EPSILON;            
        }if(esDiagonal(caracter)){
            return Lenguaje.DIAGONAL;            
        }if(esAsterisco(caracter)){
            return Lenguaje.ASTERISCO;            
        }else{
            System.out.println("NO ES NADA");
            return Lenguaje.CARACTER_FUERA_LENGUAJE;
        }
    }
    
    public boolean esNumero(String caracter){
        try {
            Integer.valueOf(caracter);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean esPunto(String caracter){
        if(caracter.equals(".")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esLetra(String caracter){
        if(caracter.equals("a")|caracter.equals("b")|caracter.equals("c")|caracter.equals("d")|caracter.equals("e")|caracter.equals("f")|caracter.equals("g")|caracter.equals("h")|caracter.equals("i")|caracter.equals("j")|caracter.equals("k")|caracter.equals("l")|caracter.equals("m")|caracter.equals("n")|caracter.equals("o")|caracter.equals("p")|caracter.equals("q")|caracter.equals("r")|caracter.equals("s")|caracter.equals("t")|caracter.equals("u")|caracter.equals("v")|caracter.equals("w")|caracter.equals("x")|caracter.equals("y")|caracter.equals("z")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esEpsilon(String caracter){
        if(caracter.equals(" ")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esDiagonal(String caracter){
        if(caracter.equals("/")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esAsterisco(String caracter){
        if(caracter.equals("*")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esAgrupacion(String caracter){
        if(caracter.equals("(")|caracter.equals(")")|caracter.equals("{")|caracter.equals("}")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esPalabraReservada(String caracter){
        if(caracter.equals("funcion")|caracter.equals("principal")|caracter.equals("retornar")|caracter.equals("vacio")|caracter.equals("variable")|caracter.equals("entero")|caracter.equals("decimal")|caracter.equals("booleano")|caracter.equals("cadena")|caracter.equals("carácter")|caracter.equals("si")|caracter.equals("sino")|caracter.equals("mientras")|caracter.equals("para")|caracter.equals("hacer")|caracter.equals("imprimir")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esBoleano(String caracter){
        if(caracter.equals("VERDADERO")|caracter.equals("FALSO")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esOperador(String caracter){
        if(caracter.equals("VERDADERO")|caracter.equals("FALSO")){
            return true;
        }else{
            return false;
        }
    }
    
    public String verificarTipo(int estado){
        if(esEstadoValidado(estado)){
            if(estado==Estado.S1){
                return "Numero";
            }else if(estado==Estado.S3){
                return "Numero Flotante";
            }else if(estado==Estado.S4){
                return "Identificador";
            }else if(estado==Estado.S5){
                return "Signo";
            }else if(estado==Estado.S7){
                return "Cadena";
            }else if(estado==Estado.S10){
                return "Caracter";
            }else if(estado==Estado.S11){
                return "Operador";
            }else if(estado==Estado.S15){
                return "Comentario";
            }else if(estado==Estado.S16){
                return "Signo De Agrupacion";
            }else if(estado==Estado.S17){
                return "Palabra Reservada";
            }else{
                return "No Registrado";
            }
        }else{
            return "Error";
        }
    }
    
    public boolean esEstadoValidado(int estado){
        for (int i = 0; i < estadosValidados.length; i++) {
            if(estado==estadosValidados[i]){
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
