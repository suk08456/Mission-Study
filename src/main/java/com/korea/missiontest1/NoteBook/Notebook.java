package com.korea.missiontest1.NoteBook;


import com.korea.missiontest1.NotePage.NotePage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Notebook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 30)
    private String name;
    @Column(nullable = false)
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "notebook")
    private List<NotePage> notePageList;

}
