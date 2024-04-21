package mx.com.test.microservices.repositories;

import mx.com.test.microservices.models.PokemonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPokemonRepository extends JpaRepository<PokemonModel, Integer> {

    @Query( value = "select * from pokemon where `National Number` = ?1", nativeQuery = true )
    List<PokemonModel> getPokemonByNationalNumber( int nationalNumber );
}
