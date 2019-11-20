
package proyecto2_lfydp.Backend;

import java.util.ArrayList;

public class Analizador {
    
    public void analizadorLexicoRun(String texto){
        try {
            ArrayList<String> tokens = new ArrayList<>();
            ArrayList<String> tipos = new ArrayList<>();
            
            int [] estados = {Estado.S0,Estado.S1,Estado.S2,Estado.S3,Estado.S4,Estado.S5,Estado.S6,Estado.S7,Estado.S8,Estado.S9,Estado.S10,Estado.S11,Estado.S12,Estado.S13,Estado.S14,Estado.S15,Estado.S16,Estado.S17};
            
            int apuntador;
            
            int [][] matriz = new int[11][16];
            matriz[0][0]=Estado.S1;
            matriz[2][0]=Estado.S4;
            matriz[3][0]=Estado.S8;
            matriz[5][0]=Estado.S5;
            matriz[6][0]=Estado.S11;
            matriz[9][0]=Estado.S16;
            matriz[10][0]=Estado.S17;
            matriz[0][1]=Estado.S1;
            matriz[1][1]=Estado.S2;
            matriz[0][2]=Estado.S3;
            matriz[2][4]=Estado.S4;
            matriz[2][5]=Estado.S6;
            matriz[4][5]=Estado.S6;
            matriz[5][5]=Estado.S7;
            matriz[2][8]=Estado.S9;
            matriz[4][8]=Estado.S9;
            matriz[3][9]=Estado.S10;
            matriz[7][11]=Estado.S12;
            matriz[7][12]=Estado.S14;
            matriz[8][12]=Estado.S13;
            matriz[7][13]=Estado.S14;
            matriz[6][14]=Estado.S15;
            
//            for (int i = 0; i < 11; i++) {
//                for (int j = 0; j < 16; j++) {
//                    System.out.println("VALOR MATRIZ en ["+(i)+"]"+" "+"["+(j)+"]"+" :"+matriz[i][j]);
//                    
//                }
//                
//            }

            String token="";
            Verificador verificador = new Verificador();
            apuntador=Estado.S0;
            boolean termino = false;
            for (int i = 0; i < texto.length(); i++) {
                String car = String.valueOf(texto.charAt(i));
                System.out.println("ANALIZANDO: "+car);
                int tipo = verificador.verificarCaracter(car);
                if (tipo==Lenguaje.EPSILON&&token.equals("")){
                    apuntador=Estado.S0;
                }else if(tipo==Lenguaje.EPSILON){
                    tokens.add(car);
                    tipos.add(verificador.verificarTipo(apuntador));
                    apuntador=Estado.S0;                    
                    token="";
                }else{
                   token+=car;
                   apuntador=matriz[tipo][apuntador];
                    System.out.println("PASO");
                }
            }
            
            //Metodo mostrar tokens en consola
            for (int i = 0; i < matriz.length; i++) {
                System.out.println("TOKEN: "+tokens.get(i)+" TIPO: "+tipos.get(i));
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
