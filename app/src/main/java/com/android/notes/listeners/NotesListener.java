package com.android.notes.listeners;

import com.android.notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
