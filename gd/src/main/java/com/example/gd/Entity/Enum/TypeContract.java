package com.example.gd.Entity.Enum;

public enum TypeContract {
    INDETERMINATO("Senza scadenza"),
    DETERMINATO("Con durata prestabilita"),
    STAGE("Stage finalizzato all'assunzione"),
    APPRENDISTATO("Apprendista");

    private String description;

    TypeContract(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
