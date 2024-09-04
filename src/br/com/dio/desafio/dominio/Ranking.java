package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;


public class Ranking {
    private List<Dev> devsInscritos = new ArrayList<>();

    public void adicionarAoRanking(Dev dev) {
        devsInscritos.add(dev);
    }

    public void rankingPorXp() {
        devsInscritos.sort(Comparator.comparingDouble(Dev::calcularTotalXp).reversed());
        int c = 1;
        for (Dev dev : devsInscritos) {
            System.out.println(c + " - " + dev.getNome());
            c++;
        }
    }
}
