package kz.don.G118SpringDataJpa.service;

import kz.don.G118SpringDataJpa.model.Developer;
import kz.don.G118SpringDataJpa.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {
    @Autowired
    private DeveloperRepository developerRepository;
    public List<Developer> search(String search) {
        return developerRepository.search(search);
    }
}
