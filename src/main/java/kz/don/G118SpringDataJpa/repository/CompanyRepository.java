package kz.don.G118SpringDataJpa.repository;

import kz.don.G118SpringDataJpa.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
