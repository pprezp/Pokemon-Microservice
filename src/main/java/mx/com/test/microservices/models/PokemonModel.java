package mx.com.test.microservices.models;

import jakarta.persistence.*;

@Entity
@Table( name = "pokemon" )
public class PokemonModel {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "National Number" )
    private int nationalNumber;

    @Column( name = "Regional Number", nullable = true )
    private int regionalNumber;

    @Column( name = "Name", nullable = true, length = 11 )
    private String pokemonName;

    @Column( name = "Height (ft)", nullable = true)
    private Float height;

    @Column( name = "Weight (kg)", nullable = true)
    private Float weight;

    public int getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(int nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public int getRegionalNumber() {
        return regionalNumber;
    }

    public void setRegionalNumber(int regionalNumber) {
        this.regionalNumber = regionalNumber;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
