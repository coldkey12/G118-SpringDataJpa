package kz.don.G118SpringDataJpa.repository;

import kz.don.G118SpringDataJpa.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    Developer findByEmail(String email);

    @Query("SELECT d FROM Developer d " +
            "WHERE d.fullName ilike concat('%', :search, '%') " +
            "OR d.email ilike concat('%', :search, '%') " +
            "OR d.progLang ilike concat('%', :search, '%')")
    List<Developer> search(String search);
}
