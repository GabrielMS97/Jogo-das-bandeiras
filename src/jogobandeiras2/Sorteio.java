package jogobandeiras2;

public class Sorteio {

    private String pais;
    private int numCores;
    private boolean jogouCopa;
    private boolean ganhouCopa;
    private String hEquador;
    private String mGreenwich;
    private String continente;
    private String cores[];
    private boolean estrela;

    public Sorteio(int rand) {
        System.out.println(rand);
        switch (rand) {
            // Países da América do Sul (0-11)
            case 0:
                System.out.println("Argentina");
                this.pais = "Argentina";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Amarelo";
                this.jogouCopa = true;
                this.ganhouCopa = true;
                this.continente = "América do Sul";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;
            
            case 1:
                System.out.println("Brasil");
                this.pais = "Brasil";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Verde";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Azul";
                this.cores[3] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = true;
                this.continente = "América do Sul";
                this.hEquador = "Cortado";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;
                
            case 2:
                System.out.println("Colômbia");
                this.pais = "Colômbia";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Amarelo";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América do Sul";
                this.hEquador = "Cortado";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break;
                
            case 3: 
                System.out.println("Uruguai");
                this.pais = "Uruguai";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Amarelo";
                this.jogouCopa = true;
                this.ganhouCopa = true;
                this.continente = "América do Sul";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;
                
            case 4: 
                System.out.println("Bolívia");
                this.pais = "Bolívia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Verde";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Amarelo";
                this.cores[3] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América do Sul";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break;
                
            case 5: 
                System.out.println("Chile");
                this.pais = "Chile";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América do Sul";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;    
                
            case 6: 
                System.out.println("Equador");
                this.pais = "Equador";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Azul";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Dourado";
                this.cores[3] = "Amarelo";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América do Sul";
                this.hEquador = "Cortado";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break;  
                
            case 7: 
                System.out.println("Paraguai");
                this.pais = "Paraguai";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Azul";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Branco";
                this.cores[3] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América do Sul";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break; 
                
            case 8: 
                System.out.println("Peru");
                this.pais = "Peru";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América do Sul";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 9: 
                System.out.println("Venezuela");
                this.pais = "Venezuela";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Azul";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Branco";
                this.cores[3] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "América do Sul";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break; 
                
            case 10: 
                System.out.println("Guiana");
                this.pais = "Guiana";
                this.numCores = 5;
                this.cores = new String[5];
                this.cores[0] = "Preto";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Branco";
                this.cores[3] = "Amarelo";
                this.cores[4] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "América do Sul";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 11: 
                System.out.println("Suriname");
                this.pais = "Suriname";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Verde";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Branco";
                this.cores[3] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "América do Sul";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break; 
            
            // Países da América do Norte (12-14)    
            case 12: 
                System.out.println("Canadá");
                this.pais = "Canadá";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América do Norte";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 13: 
                System.out.println("Estados Unidos");
                this.pais = "Estados Unidos";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Azul";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América do Norte";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break; 
                
            case 14: 
                System.out.println("México");
                this.pais = "México";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.cores[3] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América do Norte";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
            
            // Países da América Central (15-27)   
            case 15: 
                System.out.println("Bahamas");
                this.pais = "Bahamas";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Preto";
                this.cores[1] = "Azul";
                this.cores[2] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 16: 
                System.out.println("Belize");
                this.pais = "Belize";
                this.numCores = 5;
                this.cores = new String[5];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.cores[3] = "Verde";
                this.cores[4] = "Dourado";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 17: 
                System.out.println("Costa Rica");
                this.pais = "Costa Rica";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.cores[3] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 18: 
                System.out.println("Cuba");
                this.pais = "Cuba";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break; 
                
            case 19: 
                System.out.println("El Salvador");
                this.pais = "El Salvador";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Dourado";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 20: 
                System.out.println("Guatemala");
                this.pais = "Guatemala";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Dourado";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 21: 
                System.out.println("Haiti");
                this.pais = "Haiti";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Dourado";
                this.cores[1] = "Azul";
                this.cores[2] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 22: 
                System.out.println("Honduras");
                this.pais = "Honduras";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Azul";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;
                
            case 23: 
                System.out.println("Jamaica");
                this.pais = "Jamaica";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Preto";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 24: 
                System.out.println("Nicarágua");
                this.pais = "Nicarágua";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Dourado";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 25: 
                System.out.println("Panamá");
                this.pais = "Panamá";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break; 
                
            case 26: 
                System.out.println("República Dominicana");
                this.pais = "República Dominicana";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Vermelho";
                this.cores[3] = "Dourado";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
              
            case 27: 
                System.out.println("Trinidad e Tobago");
                this.pais = "Trinidad e Tobago";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Preto";
                this.cores[1] = "Branco";
                this.cores[2] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "América Central";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
            
            // Países da Europa (28-69)    
            case 28: 
                System.out.println("Bélgica");
                this.pais = "Bélgica";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Preto";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 29: 
                System.out.println("Escócia");
                this.pais = "Escócia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 30: 
                System.out.println("Espanha");
                this.pais = "Espanha";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = true;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Cortado";
                this.estrela = false;
                break; 
                
            case 31: 
                System.out.println("França");
                this.pais = "França";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = true;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Cortado";
                this.estrela = false;
                break; 
                
            case 32: 
                System.out.println("Holanda");
                this.pais = "Holanda";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;      
                
            case 33: 
                System.out.println("Inglaterra");
                this.pais = "Inglaterra";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = true;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Cortado";
                this.estrela = false;
                break; 
                
            case 34: 
                System.out.println("Irlanda");
                this.pais = "Irlanda";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Laranja";
                this.cores[1] = "Branco";
                this.cores[2] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 35: 
                System.out.println("Irlanda do Norte");
                this.pais = "Irlanda do Norte";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 36: 
                System.out.println("Islândia");
                this.pais = "Islândia";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Azul";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 37: 
                System.out.println("País de Gales");
                this.pais = "País de Gales";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 38: 
                System.out.println("Portugal");
                this.pais = "Portugal";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Verde";
                this.cores[3] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break; 
                
            case 39: 
                System.out.println("Alemanha");
                this.pais = "Alemanha";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Preto";
                this.jogouCopa = true;
                this.ganhouCopa = true;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 40: 
                System.out.println("Áustria");
                this.pais = "Áustria";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 41: 
                System.out.println("Dinamarca");
                this.pais = "Dinamarca";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 42: 
                System.out.println("Finlândia");
                this.pais = "Finlândia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 43: 
                System.out.println("Itália");
                this.pais = "Itália";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Verde";
                this.cores[1] = "Branco";
                this.cores[2] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = true;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 44: 
                System.out.println("Luxemburgo");
                this.pais = "Luxemburgo";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 45: 
                System.out.println("Noruega");
                this.pais = "Noruega";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 46: 
                System.out.println("Suécia");
                this.pais = "Suécia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Azul";
                this.cores[1] = "Amarelo";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 47: 
                System.out.println("Suíça");
                this.pais = "Suíça";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 48: 
                System.out.println("Bósnia-Herzegovina");
                this.pais = "Bósnia-Herzegovina";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 49: 
                System.out.println("Croácia");
                this.pais = "Croácia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Azul";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Branco";
                this.cores[3] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 50: 
                System.out.println("Eslováquia");
                this.pais = "Eslováquia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Azul";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Branco";
                this.cores[3] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 51: 
                System.out.println("Eslovênia");
                this.pais = "Eslovênia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Azul";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Branco";
                this.cores[3] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 52: 
                System.out.println("Hungria");
                this.pais = "Hungria";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Verde";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 53: 
                System.out.println("Macedônia");
                this.pais = "Macedônia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 54: 
                System.out.println("Montenegro");
                this.pais = "Montenegro";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Dourado";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 55: 
                System.out.println("Polônia");
                this.pais = "Polônia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            // Rússia pertence à Eurásia
            case 56: 
                System.out.println("Rússia");
                this.pais = "Rússia";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Azul";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Eurásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 57: 
                System.out.println("República Tcheca");
                this.pais = "República Tcheca";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Azul";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 58: 
                System.out.println("Sérvia");
                this.pais = "Sérvia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Azul";
                this.cores[3] = "Dourado";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 59: 
                System.out.println("Albânia");
                this.pais = "Albânia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Preto";
                this.cores[1] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";this.estrela = false;
                break;
                
            case 60: 
                System.out.println("Belarus");
                this.pais = "Belarus";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 61: 
                System.out.println("Bulgária");
                this.pais = "Bulgária";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 62: 
                System.out.println("Estônia");
                this.pais = "Estônia";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Preto";
                this.cores[2] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 63: 
                System.out.println("Grécia");
                this.pais = "Grécia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Azul";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 64: 
                System.out.println("Ucrânia");
                this.pais = "Ucrânia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Azul";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 65: 
                System.out.println("Letônia");
                this.pais = "Letônia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 66: 
                System.out.println("Lituânia");
                this.pais = "Lituânia";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Verde";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 67: 
                System.out.println("Malta");
                this.pais = "Malta";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Dourado";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 68: 
                System.out.println("Moldávia");
                this.pais = "Moldávia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Azul";
                this.cores[3] = "Dourado";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 69: 
                System.out.println("Romênia");
                this.pais = "Romênia";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Azul";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Europa";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            // Países da Eurásia (70-75)
            case 70: 
                System.out.println("Armênia");
                this.pais = "Armênia";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Eurásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 71: 
                System.out.println("Azerbaijão");
                this.pais = "Azerbaijão";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Verde";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Azul";
                this.cores[3] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Eurásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 72: 
                System.out.println("Casaquistão");
                this.pais = "Casaquistão";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Azul";
                this.cores[1] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Eurásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 73: 
                System.out.println("Chipre");
                this.pais = "Chipre";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Eurásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 74: 
                System.out.println("Geórgia");
                this.pais = "Geórgia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Eurásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 75: 
                System.out.println("Turquia");
                this.pais = "Turquia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Eurásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
            
            // Países da Ásia (76-115)    
            case 76: 
                System.out.println("Arábia Saudita");
                this.pais = "Arábia Saudita";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 77: 
                System.out.println("Bahrein");
                this.pais = "Bahrein";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 78: 
                System.out.println("Catar");
                this.pais = "Catar";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            case 79: 
                System.out.println("Emirados Árabes");
                this.pais = "Emirados Árabes";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.cores[3] = "Preto";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 80: 
                System.out.println("Iêmen");
                this.pais = "Iêmen";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Preto";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 81: 
                System.out.println("Iraque");
                this.pais = "Iraque";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Preto";
                this.cores[3] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 82: 
                System.out.println("Israel");
                this.pais = "Israel";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Azul";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 83: 
                System.out.println("Jordânia");
                this.pais = "Jordânia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Preto";
                this.cores[3] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 84: 
                System.out.println("Kuwait");
                this.pais = "Kuwait";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Preto";
                this.cores[3] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 85: 
                System.out.println("Líbano");
                this.pais = "Líbano";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 86: 
                System.out.println("Omã");
                this.pais = "Omã";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 87: 
                System.out.println("Síria");
                this.pais = "Síria";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.cores[3] = "Preto";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 88: 
                System.out.println("Afeganistão");
                this.pais = "Afeganistão";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.cores[3] = "Preto";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 89: 
                System.out.println("Índia");
                this.pais = "Índia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Laranja";
                this.cores[2] = "Verde";
                this.cores[3] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 90: 
                System.out.println("Irã");
                this.pais = "Irã";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 91: 
                System.out.println("Maldivas");
                this.pais = "Maldivas";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Cortado";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 92: 
                System.out.println("Paquistão");
                this.pais = "Paquistão";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 93: 
                System.out.println("Quirguistão");
                this.pais = "Quirguistão";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 94: 
                System.out.println("Sri Lanka");
                this.pais = "Sri Lanka";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Laranja";
                this.cores[3] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 95: 
                System.out.println("Tajiquistão");
                this.pais = "Tajiquistão";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Branco";
                this.cores[3] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 96: 
                System.out.println("Turcomenistão");
                this.pais = "Turcomenistão";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Branco";
                this.cores[3] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 97: 
                System.out.println("Usbequistão");
                this.pais = "Usbequistão";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.cores[3] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 98: 
                System.out.println("Bangladesh");
                this.pais = "Bangladesh";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 99: 
                System.out.println("Brunei");
                this.pais = "Brunei";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Preto";
                this.cores[3] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 100: 
                System.out.println("Butão");
                this.pais = "Butão";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Laranja";
                this.cores[1] = "Branco";
                this.cores[2] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 101: 
                System.out.println("Camboja");
                this.pais = "Camboja";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 102: 
                System.out.println("China");
                this.pais = "China";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 103: 
                System.out.println("Cingapura");
                this.pais = "Cingapura";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 104: 
                System.out.println("Coréia do Norte");
                this.pais = "Coréia do Norte";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Azul";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 105: 
                System.out.println("Coréia do Sul");
                this.pais = "Coréia do Sul";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Azul";
                this.cores[2] = "Preto";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 106: 
                System.out.println("Indonésia");
                this.pais = "Indonésia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Cortado";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 107: 
                System.out.println("Japão");
                this.pais = "Japão";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 108: 
                System.out.println("Laos");
                this.pais = "Laos";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 109: 
                System.out.println("Malásia");
                this.pais = "Malásia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Azul";
                this.cores[3] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 110: 
                System.out.println("Mongólia");
                this.pais = "Mongólia";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Azul";
                this.cores[2] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 111: 
                System.out.println("Myanmar");
                this.pais = "Myanmar";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 112: 
                System.out.println("Nepal");
                this.pais = "Nepal";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 113: 
                System.out.println("Tailândia");
                this.pais = "Tailândia";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 114: 
                System.out.println("Taiwan");
                this.pais = "Taiwan";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 115: 
                System.out.println("Vietnã");
                this.pais = "Vietnã";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Ásia";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
            
            // Países da Oceania (116-129)
            case 116: 
                System.out.println("Austrália");
                this.pais = "Austrália";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 117: 
                System.out.println("Fiji");
                this.pais = "Fiji";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.cores[3] = "Dourado";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 118: 
                System.out.println("Ilhas Marshall");
                this.pais = "Ilhas Marshall";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Laranja";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 119: 
                System.out.println("Ilhas Salomão");
                this.pais = "Ilhas Salomão";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.cores[3] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 120: 
                System.out.println("Kiribati");
                this.pais = "Kiribati";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Azul";
                this.cores[2] = "Branco";
                this.cores[3] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Cortado";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 121: 
                System.out.println("Micronésia");
                this.pais = "Micronésia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Cortado";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 122: 
                System.out.println("Nauru");
                this.pais = "Nauru";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Azul";
                this.cores[2] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 123: 
                System.out.println("Nova Zelândia");
                this.pais = "Nova Zelândia";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Azul";
                this.cores[2] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 124: 
                System.out.println("Palau");
                this.pais = "Palau";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 125: 
                System.out.println("Papua-Nova Guiné");
                this.pais = "Papua-Nova Guiné";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Preto";
                this.cores[3] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 126: 
                System.out.println("Samoa");
                this.pais = "Samoa";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;
                
            case 127: 
                System.out.println("Tonga");
                this.pais = "Tonga";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break;
                
            case 128: 
                System.out.println("Tuvalu");
                this.pais = "Tuvalu";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Azul";
                this.cores[3] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 129: 
                System.out.println("Vanuatu");
                this.pais = "Vanuatu";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Preto";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.cores[3] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "Oceania";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            // Países da África (130-183)
            case 130: 
                System.out.println("África do Sul");
                this.pais = "África do Sul";
                this.numCores = 6;
                this.cores = new String[6];
                this.cores[0] = "Preto";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.cores[3] = "Amarelo";
                this.cores[4] = "Azul";
                this.cores[5] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 131: 
                System.out.println("Angola");
                this.pais = "Angola";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Preto";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Amarelo";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 132: 
                System.out.println("Argélia");
                this.pais = "Argélia";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Cortado";
                this.estrela = true;
                break;
                
            case 133: 
                System.out.println("Benin");
                this.pais = "Benin";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 134: 
                System.out.println("Botsuana");
                this.pais = "Botsuana";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Preto";
                this.cores[2] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 135: 
                System.out.println("Burkina Faso");
                this.pais = "Burkina Faso";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Cortado";
                this.estrela = true;
                break;
                
            case 136: 
                System.out.println("Burundi");
                this.pais = "Burundi";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 137: 
                System.out.println("Cabo Verde");
                this.pais = "Cabo Verde";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Azul";
                this.cores[3] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;
               
            case 138: 
                System.out.println("Camarões");
                this.pais = "Camarões";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Verde";
                this.cores[2] = "Amarelo";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 139: 
                System.out.println("Chade");
                this.pais = "Chade";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 140: 
                System.out.println("Comores");
                this.pais = "Comores";
                this.numCores = 5;
                this.cores = new String[5];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Azul";
                this.cores[3] = "Verde";
                this.cores[4] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 141: 
                System.out.println("Costa do Marfim");
                this.pais = "Costa do Marfim";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Laranja";
                this.cores[1] = "Branco";
                this.cores[2] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break;
                
            case 142: 
                System.out.println("Djibouti");
                this.pais = "Djibouti";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Verde";
                this.cores[3] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 143: 
                System.out.println("Egito");
                this.pais = "Egito";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Preto";
                this.cores[3] = "Amarelo";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            case 144: 
                System.out.println("Eritréia");
                this.pais = "Eritréia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Verde";
                this.cores[2] = "Azul";
                this.cores[3] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 145: 
                System.out.println("Etiópia");
                this.pais = "Etiópia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Verde";
                this.cores[2] = "Azul";
                this.cores[3] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
                
            case 146: 
                System.out.println("Gabão");
                this.pais = "Gabão";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Verde";
                this.cores[2] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Cortado";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
                
            case 147: 
                System.out.println("Gâmbia");
                this.pais = "Gâmbia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Verde";
                this.cores[2] = "Azul";
                this.cores[3] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break;
                
            case 148: 
                System.out.println("Gana");
                this.pais = "Gana";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Verde";
                this.cores[2] = "Amarelo";
                this.cores[3] = "Preto";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Cortado";
                this.estrela = true;
                break;
            
            case 149: 
                System.out.println("Guiné");
                this.pais = "Guiné";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Verde";
                this.cores[2] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break;
            
            case 150: 
                System.out.println("Guiné Equatorial");
                this.pais = "Guiné Equatorial";
                this.numCores = 5;
                this.cores = new String[5];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Verde";
                this.cores[2] = "Dourado";
                this.cores[3] = "Azul";
                this.cores[4] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            case 151:
                System.out.println("Guiné-Bissau");
                this.pais = "Guiné-Bissau";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Verde";
                this.cores[2] = "Amarelo";
                this.cores[3] = "Preto";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;
            
            case 152: 
                System.out.println("Lesoto");
                this.pais = "Lesoto";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Verde";
                this.cores[2] = "Azul";
                this.cores[3] = "Preto";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            case 153: 
                System.out.println("Libéria");
                this.pais = "Libéria";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;
            
            case 154: 
                System.out.println("Líbia");
                this.pais = "Líbia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.cores[3] = "Preto";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
            
            case 155: 
                System.out.println("Madagascar");
                this.pais = "Madagascar";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Branco";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            case 156: 
                System.out.println("Malawi");
                this.pais = "Malawi";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Preto";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
            
            case 157: 
                System.out.println("Mali");
                this.pais = "Mali";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Cortado";
                this.estrela = false;
                break;
            
            case 158: 
                System.out.println("Marrocos");
                this.pais = "Marrocos";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;
            
            case 159: 
                System.out.println("Maurício");
                this.pais = "Maurício";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Verde";
                this.cores[2] = "Azul";
                this.cores[3] = "Amarelo";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            case 160: 
                System.out.println("Mauritânia");
                this.pais = "Mauritânia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;
            
            case 161: 
                System.out.println("Moçambique");
                this.pais = "Moçambique";
                this.numCores = 5;
                this.cores = new String[5];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Verde";
                this.cores[2] = "Preto";
                this.cores[3] = "Branco";
                this.cores[4] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
            
            case 162: 
                System.out.println("Namíbia");
                this.pais = "Namíbia";
                this.numCores = 5;
                this.cores = new String[5];
                this.cores[0] = "Amarelo";
                this.cores[1] = "Verde";
                this.cores[2] = "Azul";
                this.cores[3] = "Branco";
                this.cores[4] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
            
            case 163: 
                System.out.println("Níger");
                this.pais = "Níger";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Laranja";
                this.cores[1] = "Verde";
                this.cores[2] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            case 164: 
                System.out.println("Nigéria");
                this.pais = "Nigéria";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Verde";
                this.cores[1] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            case 165: 
                System.out.println("Quênia");
                this.pais = "Quênia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Verde";
                this.cores[1] = "Branco";
                this.cores[2] = "Vermelho";
                this.cores[3] = "Preto";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Cortado";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
            
            case 166: 
                System.out.println("Congo");
                this.pais = "Congo";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Verde";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Cortado";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;
               
            case 167: 
                System.out.println("República Centro-Africana");
                this.pais = "República Centro-Africana";
                this.numCores = 5;
                this.cores = new String[5];
                this.cores[0] = "Verde";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Vermelho";
                this.cores[3] = "Branco";
                this.cores[4] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
            
            case 168: 
                System.out.println("República Democratica do Congo");
                this.pais = "República Democratica do Congo";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Cortado";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
            
            case 169: 
                System.out.println("Ruanda");
                this.pais = "Ruanda";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
            
            case 170: 
                System.out.println("São Tomé e Príncipe");
                this.pais = "São Tomé e Príncipe";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Verde";
                this.cores[3] = "Preto";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Cortado";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;
              
            case 171: 
                System.out.println("Senegal");
                this.pais = "Senegal";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Verde";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = true;
                break;
            
            case 172: 
                System.out.println("Serra Leoa");
                this.pais = "Serra Leoa";
                this.numCores = 3;
                this.cores = new String[3];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Oeste";
                this.estrela = false;
                break;
                
            case 173: 
                System.out.println("Seychelles");
                this.pais = "Seychelles";
                this.numCores = 5;
                this.cores = new String[5];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Verde";
                this.cores[3] = "Amarelo";
                this.cores[4] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break;    
            
            case 174: 
                System.out.println("Somália");
                this.pais = "Somália";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Cortado";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break; 
                    
            case 175: 
                System.out.println("Suazilândia");
                this.pais = "Suazilândia";
                this.numCores = 5;
                this.cores = new String[5];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Preto";
                this.cores[3] = "Amarelo";
                this.cores[4] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                    
            case 176: 
                System.out.println("Sudão do Sul");
                this.pais = "Sudão do Sul";
                this.numCores = 6;
                this.cores = new String[6];
                this.cores[0] = "Azul";
                this.cores[1] = "Branco";
                this.cores[2] = "Preto";
                this.cores[3] = "Amarelo";
                this.cores[4] = "Vermelho";
                this.cores[5] = "Verde";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break;    
            
            case 177:
                System.out.println("Sudão");
                this.pais = "Sudão";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Verde";
                this.cores[1] = "Branco";
                this.cores[2] = "Preto";
                this.cores[3] = "Vermelho";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 178:
                System.out.println("Tanzânia");
                this.pais = "Tanzânia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Verde";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Preto";
                this.cores[3] = "Azul";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 179:
                System.out.println("Togo");
                this.pais = "Togo";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Verde";
                this.cores[1] = "Amarelo";
                this.cores[2] = "Branco";
                this.cores[3] = "Vermelho";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break; 
                
            case 180:
                System.out.println("Tunísia");
                this.pais = "Tunísia";
                this.numCores = 2;
                this.cores = new String[2];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.jogouCopa = true;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Acima";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break; 
                
            case 181:
                System.out.println("Uganda");
                this.pais = "Uganda";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Vermelho";
                this.cores[1] = "Branco";
                this.cores[2] = "Amarelo";
                this.cores[3] = "Preto";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Cortado";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 182:
                System.out.println("Zâmbia");
                this.pais = "Zâmbia";
                this.numCores = 4;
                this.cores = new String[4];
                this.cores[0] = "Verde";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Amarelo";
                this.cores[3] = "Preto";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = false;
                break; 
                
            case 183:
                System.out.println("Zimbábue");
                this.pais = "Zimbábue";
                this.numCores = 5;
                this.cores = new String[5];
                this.cores[0] = "Verde";
                this.cores[1] = "Vermelho";
                this.cores[2] = "Amarelo";
                this.cores[3] = "Preto";
                this.cores[4] = "Branco";
                this.jogouCopa = false;
                this.ganhouCopa = false;
                this.continente = "África";
                this.hEquador = "Abaixo";
                this.mGreenwich = "Leste";
                this.estrela = true;
                break; 
                
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumCores() {
        return numCores;
    }

    public void setNumCores(int numCores) {
        this.numCores = numCores;
    }

    public boolean isJogouCopa() {
        return jogouCopa;
    }

    public void setJogouCopa(boolean jogouCopa) {
        this.jogouCopa = jogouCopa;
    }

    public boolean isGanhouCopa() {
        return ganhouCopa;
    }

    public void setGanhouCopa(boolean ganhouCopa) {
        this.ganhouCopa = ganhouCopa;
    }

    public String gethEquador() {
        return hEquador;
    }

    public void sethEquador(String hEquador) {
        this.hEquador = hEquador;
    }

    public String getmGreenwich() {
        return mGreenwich;
    }

    public void setmGreenwich(String mGreenwich) {
        this.mGreenwich = mGreenwich;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String[] getCores() {
        return cores;
    }

    public void setCores(String[] cores) {
        this.cores = cores;
    }

    public boolean isEstrela() {
        return estrela;
    }

    public void setEstrela(boolean estrela) {
        this.estrela = estrela;
    }
    
    

}
