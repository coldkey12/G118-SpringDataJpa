package kz.don.G118SpringDataJpa.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "POSITIONS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SALARY")
    private String salary;

}
