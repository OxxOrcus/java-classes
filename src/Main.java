public class Main {
        public static void main(String[] args) {
                // ! FIRST CLASS (STRING)
                // String nome = "Paulo";
                // System.out.println("Hello, " + nome + "!");
                // -------------------------------------------------------------------------------------------------------
                // ! SECOND CLASS (NUMBERS) INT float
                // int a;
                // int b = 2;
                // a = 3;
                // int soma = a + b;
                // int subtracao = a - b;
                // int multiplicacao = a * b;
                // float divisao = (float)a / b;
                //
                // System.out.println(soma);
                // System.out.println(subtracao);
                // System.out.println(multiplicacao);
                // System.out.println(divisao);
                // -------------------------------------------------------------------------------------------------------
                // ! THIRD CLASS (BOOLEAN)
                // boolean a = true;
                // boolean b = false;
                // System.out.println(a);
                // System.out.println(b);

                // Tabela Verdade
                // Operador && (AND)
                // true & true = true
                // true & false = false
                // false & true = false
                // false & false = false

                // Operador || (OR)
                // true || true = true
                // true || false = true
                // false || true = true
                // false || false = false

                // ---------------------------------------------------------------------------------------------------

                // FOURTH CLASS (ESTRUTURAS CONDICIONAIS)
                // int nota = 80;
                // String graduacao;

                // nota for maior que 70 APROVADO
                // if-else
                // if (nota >= 70) {
                // System.out.println("Aluno Aprovado!");
                // } else {
                // System.out.println("Aluno Reprovado");
                // }

                // simulacao de regras das classificacoes de notas: A 80 B 70 C 60 D 0
                // if (nota >= 80) {
                // graduacao = "A";
                // } else if (nota < 80 && nota>=70) {
                // graduacao = "B";
                // } else if (nota < 70 && nota>=60) {
                // graduacao = "C";
                // } else if (nota < 60 && nota>=0) {
                // graduacao = "D";
                // } else {
                // graduacao = "";
                // }
                //
                // switch (graduacao) {
                // case "A":
                // case "B":
                // System.out.println("Aluno aprovado!");
                // break;
                // case "C":
                // case "D":
                // System.out.println("Aluno Reprovado");
                // break;
                // default:
                // System.out.println("Graduacao invalida!");
                // }

                // ---------------------------------------------------------------------------------------------------
                // CLASS 5 (MANIPULACAO DE STRINGS E DATAS)

                //String nome = "Paulo";
                // System.out.println(nome.toUpperCase()); //todas as letras MAIUSCULA
                // System.out.println(nome.toLowerCase()); //todas as letras minusculas
                // System.out.println(nome.length()); //consultar comprimento
                //
                // String nomeOutro = "Paulo";
                // System.out.println(nome.equalsIgnoreCase(nomeOutro));
//                LocalDate hoje = LocalDate.now();
//                Locale brasil = new Locale("pt", "BR");
//                // System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,
//                // brasil));
//                String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
//                String saudacao;
//                LocalDateTime agora = LocalDateTime.now();
//                if (agora.getHour() >= 0 && agora.getHour() < 12) {
//                        saudacao = "bom dia";
//                } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
//                        saudacao = "boa tarde";
//                } else if (agora.getHour() <= 18 && agora.getHour() < 24) {
//                        saudacao = "boa noite";
//                } else {
//                        saudacao = "Ola.";
//                }
//
//                System.out.printf("Ola, %s. Hoje e %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

            // ---------------------------------------------------------------------------------------------------
//! CLASS 6 (LACOS NUMERICOS)

            // 1 2 3 4 5 6 7 8 9 10
            // para uma variavel que inicia em 1, e ai ate 10, mudando 1-por-1, faca:
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println(j + "x" + i + "=" + j * i);
                    //1x1=1
                    //2x1=2
                }
            }
        }
}