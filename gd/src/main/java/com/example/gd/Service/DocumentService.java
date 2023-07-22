package com.example.gd.Service;

import com.example.gd.Entity.Documents;
import com.example.gd.Repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {
    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public void saveDocumentWithPDF(byte[] pdfData /* altri dati del documento */) {
        Documents documents = new Documents(/* inizializza gli attributi del documento */);
        documents.setFilePDF(pdfData);
        documentRepository.save(documents);
    }

    public byte[] getPDFDataById(Long documentsId) {
        Documents documents = documentRepository.findById(documentsId).orElse(null);
        if (documents != null) {
            return documents.getFilePDF();
        }
        return null;
    }
}
