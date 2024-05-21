package p.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Paises {
    private String nome;
    private String capital;
    private double dimensaoKm2;
    private List<Paises> fronteiras;

    public Paises(String nome, String capital, double dimensaoKm2) {
        this.nome = nome;
        this.capital = capital;
        this.dimensaoKm2 = dimensaoKm2;
        this.fronteiras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public double getDimensaoKm2() {
        return dimensaoKm2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paises paises = (Paises) o;
        return nome.equals(paises.nome) && capital.equals(paises.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, capital);
    }

    public void adicionarFronteira(Paises pais) {
        if (!this.equals(pais) && !fronteiras.contains(pais)) {
            fronteiras.add(pais);
            if (!pais.getFronteiras().contains(this)) {
                pais.adicionarFronteira(this); // Adiciona a fronteira de forma bidirecional
            }
        }
    }

    public List<Paises> getFronteiras() {
        return fronteiras;
    }

    public List<Paises> vizinhosComuns(Paises outro) {
        List<Paises> vizinhosComuns = new ArrayList<>();
        for (Paises vizinho : this.fronteiras) {
            if (outro.getFronteiras().contains(vizinho)) {
                vizinhosComuns.add(vizinho);
            }
        }
        return vizinhosComuns;
    }
}
