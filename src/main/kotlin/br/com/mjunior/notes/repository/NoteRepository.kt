package br.com.mjunior.notes.repository

import br.com.mjunior.notes.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository<Note, Long>