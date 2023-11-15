package kz.don.G118SpringDataJpa.controller;

import kz.don.G118SpringDataJpa.model.Developer;
import kz.don.G118SpringDataJpa.repository.DeveloperRepository;
import kz.don.G118SpringDataJpa.repository.ProgLangRepository;
import kz.don.G118SpringDataJpa.service.DeveloperService;
import kz.don.G118SpringDataJpa.service.ProgLangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    private DeveloperService developerService;

    @Autowired
    private ProgLangService progLangService;

    @GetMapping("/")
    public String homePage(Model model) {
        var developers = developerService.findAll();
        var progLangs = progLangService.getProgrammingLanguages();
        model.addAttribute("razraby", developers);
        model.addAttribute("progLangs", progLangs);
        return "home";
    }

    @GetMapping("/developer/{id}")
    public String getDeveloperById(@PathVariable Long id, Model model) {
        Developer developer = developerService.findById(id).orElse(null);
        var progLangs = progLangService.getProgrammingLanguages();
        model.addAttribute("razrab", developer);
        model.addAttribute("progLangs", progLangs);
        return "developer-details";
    }

    @PostMapping("/developer/add")
    public String addDeveloper(Developer developer) {
        developerService.save(developer);
        return "redirect:/";
    }

    @PostMapping("/developer/update")
    public String updateDeveloper(Developer developer) {
        developerService.save(developer);
        return "redirect:/";
    }

    @GetMapping("/developer/details/{email}")
    public String getDeveloperByEmail(@PathVariable String email, Model model) {
        Developer developer = developerService.findByEmail(email);
        model.addAttribute("razrab", developer);
        return "developer-details";
    }

    @GetMapping("/developer/search")
    public String getDevelopers(@RequestParam String search, Model model) {
        List<Developer> developers = developerService.search(search);
        model.addAttribute("razraby", developers);
        return "home";
    }
}
