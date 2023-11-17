package kz.don.G118SpringDataJpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "DEVELOPERS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;

    @Column(name = "FULL_NAME", nullable = false)
    private String fullName;

    @Column(name = "AGE")
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "PROGRAMMING_LANGUAGE_ID")
    private ProgrammingLanguage programmingLanguage;

    @OneToOne
    private Position position;

    @ManyToMany
    private List<Company> companies;
}
