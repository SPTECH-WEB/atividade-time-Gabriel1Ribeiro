package school.sptech;

public class Time {
    String nome;
    Integer vitorias = 0;
    Integer empates = 0;
    Integer derrotas = 0;

//    Time time1 = new Time();


    public void registrarVitoria() {
        vitorias += 1;
    }

    public void registrarEmpate() {
        empates += 1;
    }


    public void registrarDerrota() {
        derrotas += 1;
    }

    public Integer getPontos() {
        Integer totalPontos = (vitorias * 3) + empates;

        return totalPontos;
    }

     public Integer getTotalPartidas() {
        return vitorias + empates + derrotas;
    }

    public Integer getAproveitamento() {
        return (vitorias * 100)/ getTotalPartidas();
    }

    public void compararAproveitamento(Time x) {
        if(getAproveitamento() > x.getAproveitamento()){
            System.out.println("O time Estrela do Norte tem um aproveitamento maior que o time Águia Branca.".formatted(nome, x.nome));
        } else if (getAproveitamento() < x.getAproveitamento()) {
            System.out.println("O time Estrela do Norte tem um aproveitamento maior que o time Águia Branca.".formatted(x.nome, nome));
        } else{
            System.out.println("");
        }
    }

    public void exibirInformacoes() {
        var texto = "Time: %s\n" +
                "Vitórias: %s\n" +
                "Empates: %s\n" +
                "Derrotas: %s\n" +
                "\n" +
                "Pontos: %s\n" +
                "Total de Partidas: %s\n" +
                "Aproveitamento: %s%\n".formatted(
                nome,
                vitorias,
                empates,
                derrotas,
                getPontos(),
                getTotalPartidas(),
                getAproveitamento()
        );
    }

}
