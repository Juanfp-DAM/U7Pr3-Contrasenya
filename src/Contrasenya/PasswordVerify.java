package Contrasenya;

public class PasswordVerify {


    private String pass;
    private boolean verificaPass;

    public PasswordVerify() {

    }

    public String passwordString(String psw){
        String requisitos = "";
        int tamanyoPalabras;
        if(psw==null){
            requisitos += "La contraseña ha de tener almenos 8 carácteres. ";
            tamanyoPalabras=0;
        } else if(psw.length()<8){
            requisitos += "La contraseña ha de tener almenos 8 carácteres. ";
            tamanyoPalabras=psw.length();
        }else{
            tamanyoPalabras=psw.length();
        }

        //Verificación que contenga 2 números o más
        int cuentaNumeros =0;
        int cuentaMayus = 0;
        int cuentaSimbolo=0;

        for (int i = 0; i < tamanyoPalabras; i++) {
            String guardaLetra = String.valueOf(psw.charAt(i));
            if(guardaLetra.matches("[0-9]")){
                cuentaNumeros++;
            }
            if(guardaLetra.matches("[A-Z]")){
                cuentaMayus++;
            }
            //Si tiene cualquier cosa distinta de A-Z, a-z, 0-9
            if(guardaLetra.matches("[^\\w\\s]")){
                cuentaSimbolo++;
            }
        }
        if(cuentaNumeros<2){
            requisitos+="La contraseña ha de tener 2 dígitos o más. ";
        }
        if(cuentaMayus==0){
            requisitos+="La contraseña ha de tener al menos una letra mayúscula. ";
        }
        if(cuentaSimbolo==0){
            requisitos+="La contraseña ha de tener al menos un carácter especial.";
        }

        return requisitos;
    }

    public boolean verificaPassw(){
        boolean verificador = true;
        if(!passwordString(pass).equals("")){
            verificador=false;
        }
        return verificador;
    }




}
