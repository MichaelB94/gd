package com.example.gd.Entity;

import com.example.gd.Entity.Enum.TypeDocument;
import com.example.gd.Entity.Enum.TypeStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Blob;

import java.time.LocalDateTime;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Documents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "type_document")
    @Enumerated(EnumType.ORDINAL)
    private TypeDocument typeDocument;

    @Column(nullable = false, name = "title")
    private String title;

    @Column(nullable = false, name = "notes")
    private String notes;

    @Column(nullable = false, name = "created_at")
    private LocalDateTime createdAt;

    @Column(nullable = false, name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(nullable = false, name = "created_or_updated_by")
    private String createdOrUpdatedBy;

    @Column(nullable = false, name = "type_status")
    @Enumerated(EnumType.ORDINAL)
    private TypeStatus typeStatus;

    @Lob
    @Column(nullable = false, name = "file_pdf")
    private byte[] filePDF;

}
