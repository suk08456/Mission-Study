package com.korea.missiontest1.NoteBook;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NotebookService {
    private final NotebookRepository notebookRepository;

    public List<Notebook> getNotebookList() {
        return notebookRepository.findAll();
    }

    public Notebook getNotebookById(Long id) {
        Optional<Notebook> notebookOptional = notebookRepository.findById(id);
        if(notebookOptional.isPresent()) {
            return notebookOptional.get();
        }

        throw new IllegalArgumentException("해당 노트북은 존재하지 않습니다.");
    }

    public void saveDefaultNotebook() {
        Notebook notebook = new Notebook();
        notebook.setName("새노트");

        notebookRepository.save(notebook);
    }
}