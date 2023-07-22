package com.example.gd.Entity.Enum;

public enum TypeDocument {
    CF("Codice Fiscale"),
    CI("Carta d'Identità"),
    LICENCE("Driver License"),
    PASSPORT("Passport"),
    COURSE("Course"),
    PAYCHECK("Paycheck"),
    PERMISSION("Permission"),
    HOLIDAYS("Holidays"),
    MUTUAL("Mutual"),
    INJURY("Injury"),
    TRANSFER("Transfer"),
    OTHER("Other");

    private String description;

    TypeDocument(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
