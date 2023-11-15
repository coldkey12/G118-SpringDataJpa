package kz.don.G118SpringDataJpa.model;

import jakarta.persistence.*;
import lombok.*;

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

    @Column(name = "PROG_LANG", columnDefinition = "TEXT")
    private String progLang;
}
