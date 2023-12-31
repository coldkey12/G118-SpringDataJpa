package kz.don.G118SpringDataJpa.service;

import kz.don.G118SpringDataJpa.model.Developer;
import kz.don.G118SpringDataJpa.repository.CompanyRepository;
import kz.don.G118SpringDataJpa.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeveloperService {
    @Autowired
    private DeveloperRepository developerRepository;

    @Autowired
    private CompanyRepository companyRepository;

    public List<Developer> search(String search) {
        return developerRepository.search(search);
    }

    public List<Developer> findAll() {
        return developerRepository.findAll();
    }

    public Developer findByEmail(String email) {
        return developerRepository.findByEmail(email);
    }

    public Optional<Developer> findById(Long id) {
        return developerRepository.findById(id);
    }

    public void save(Developer developer) {
        developerRepository.save(developer);
    }

    public void addCompany(Long developerId, Long companyId) {
        if(developerId == null || companyId == null){
            return;
        }
        var developer = developerRepository.findById(developerId).orElseThrow();
        var company = companyRepository.findById(companyId).orElseThrow();
        developer.getCompanies().add(company);
        developerRepository.save(developer);
    }

    public void deleteCompany(Long developerId, Long companyId) {
        if(developerId == null || companyId == null){
            return;
        }
        var developer = developerRepository.findById(developerId).orElseThrow();
        var company = companyRepository.findById(companyId).orElseThrow();
        developer.getCompanies().remove(company);
        developerRepository.save(developer);
    }
}
