package com.example.gd.Entity.Enum;

public enum TypeStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    SUSPENDED("Suspended");

    private final String description;

    private TypeStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
