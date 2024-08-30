 class atividades {
//biblioteca utilizada na PUC Minas
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void Havea(String str) {
        int contM = 0, contm = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') contM++;
            if (str.charAt(i) == 'a') contm++;
        }
        if (contM != 0 && contm != 0) {
            MyIO.println("A palavra possui " + contM + " A e " + contm + " a");
        } else if (contM != 0 && contm == 0) {
            MyIO.println("A palavra possui " + contM + " A e 0 a");
        } else if (contM == 0 && contm != 0) {
            MyIO.println("A palavra possui 0 A e " + contm + " a");
        } else {
            MyIO.println("A palavra nao possui nenhuma letra A nem a");
        }
        }

    public static void main (String[] args) {
        MyIO.println("Digite a atividade a ser realizada" + " 1 - Fibonacci " + " 2 - Palavra " + " 3 - Soma " + " 4 - Completar a logica");
        int opc = MyIO.readInt();
        switch (opc) {
            case 1:
            String saida = "";
            while (!saida.equalsIgnoreCase("esc")) { 
                MyIO.println("Digite um número a ser procurado na sequência ou 'esc' para sair do programa");
                String entrada = MyIO.readLine();
                if (entrada.equalsIgnoreCase("esc")) {
                    saida = "esc";
                } else {
                    int numero = Integer.parseInt(entrada);
                    Boolean resp = false;

                    for (int i = 0; i < 20; i++) {
                        if (numero == fibonacci(i)) {      
                            MyIO.println("O numero " + numero + " existe na sequencia");
                            resp = true;
                            break;
                        } 
                    } 
                if (!resp) {
                    MyIO.println("O numero " + numero + " nao existe na sequencia"); 
                }
            }
        }
        break;
            case 2:
            String exit = "";
            while (!exit.equalsIgnoreCase("esc")) {
                MyIO.println("Digite uma string ou 'esc' para sair do programa");
                String entrada = MyIO.readLine();
                if (entrada.equalsIgnoreCase("esc")) {
                    break;
                }
                Havea(entrada);
            }
            break;
            case 3:
                int indice = 12, soma = 0;
                for (int k = 1; k < indice; k = k + 1) {
                    soma = soma + k;
                }
                MyIO.println(soma);
            
            break;
            case 4:
            int a = 1;
            double b = 2, base = 0, resultado = 0;
            for (int i = 0; i < 4; i++) {
                a = a+2;
            }
            MyIO.println(a);
            for (int i = 0; i < 7; i++){
                resultado = Math.pow(b, base+1);
                base++;
            }
            MyIO.println(resultado);
            int basi = 0, res = 2, teste = 0;
            for (int i = 0; i < 8; i++) {
             teste = (int) Math.pow(basi, res);   
               basi++;         
            }
            MyIO.println(teste);

            int bas = 2, ex = 2, result = 0;
            for (int i = 0; i < 5; i++) {
                result = (int) Math.pow(bas, ex);
                bas = bas+2;
            } 
            MyIO.println(result);
            int asoma = 0;
            for (int i = 0; i < 7; i++) {   
                asoma = fibonacci(i);
            }
           MyIO.println(asoma);

           int bass = 2, atualizar = 0;
           for (int i = 1; i < 7; i++) {
            atualizar = bass * i; // atualizar = 2
           }
            break;
            case 5:
            MyIO.println("ligando o primeiro interruptor, você deixa ligado por uns 5 minutos até que ela aqueça, depois, apague e ligue o segundo interruptor, indo até a sala 1 vez, já dá pra descobrir qual lampada é de qual interruptor");
            break;
            default:
                break;
        }
    }
}
