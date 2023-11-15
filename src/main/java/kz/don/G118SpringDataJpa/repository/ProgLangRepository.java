package kz.don.G118SpringDataJpa.repository;

import kz.don.G118SpringDataJpa.model.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgLangRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
