package Atividade_Formatar_Data_01_06_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Data {
        int dia, mes, ano;

    Data(){
    }

    Data(int ano){
        dia = 1;
        mes = 1;
        this.ano = ano;
    }


    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

public String formatarData(String n)   {
    return this.dia + n + this.mes + n + this.ano;
}
    
}
