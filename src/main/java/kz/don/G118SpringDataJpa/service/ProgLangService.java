package kz.don.G118SpringDataJpa.service;

import kz.don.G118SpringDataJpa.model.ProgrammingLanguage;
import kz.don.G118SpringDataJpa.repository.ProgLangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgLangService {
    @Autowired
    private ProgLangRepository progLangRepository;

    public List<ProgrammingLanguage> getProgrammingLanguages(){
        return progLangRepository.findAll();
    }
}
