package br.com.mjunior.notes.controller

import br.com.mjunior.notes.model.Note
import br.com.mjunior.notes.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("notes")
class NoteController {

    @Autowired
    lateinit var noteRepository: NoteRepository

    @GetMapping
    fun list(): List<Note> {
        return noteRepository.findAll().toList()
    }

    @PostMapping
    fun create(@RequestBody note: Note): Note{
        return noteRepository.save(note)
    }
}