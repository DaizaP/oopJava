package com.example.oopjava.Seminar2.Lesson2.Ex006.Interface;

import com.example.oopjava.Seminar2.Lesson2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
