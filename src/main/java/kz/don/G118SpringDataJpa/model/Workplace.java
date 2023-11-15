package kz.don.G118SpringDataJpa.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "WORKPLACES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Workplace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "APPLICATION_AREA", columnDefinition = "VARCHAR(20)")
    private String area;

    @Column(name = "CAPTION", columnDefinition = "TEXT")
    private String caption;

    @ManyToOne
    @JoinColumn(name = "PROGRAMMING_LANGUAGE_ID")
    private ProgrammingLanguage programmingLanguage;
}
