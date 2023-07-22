package com.example.gd.Controller;

import com.example.gd.Service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/Documents")
public class DocumentController {

    private final DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService){
        this.documentService = documentService;
    }

    // Metodo per gestire la richiesta di upload del file PDF
    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file /* altri dati del documento */) {
        if (!file.isEmpty()) {
            try {
                byte[] pdfData = file.getBytes();
                // Chiamata al servizio per salvare il documento con i dati del PDF
                documentService.saveDocumentWithPDF(pdfData);

                // Inserire qui eventuali operazioni aggiuntive dopo il salvataggio del documento

            } catch (IOException e) {
                // Gestisci l'errore di lettura del file
                e.printStackTrace();
                // Inserire qui eventuali operazioni in caso di errore durante il caricamento del file
            }
        } else {
            // Inserire qui eventuali operazioni in caso di file vuoto o mancante
        }

        // Reindirizza l'utente a una pagina di successo o di errore, a seconda delle necessità
        return "redirect:/upload_success";
    }
}
