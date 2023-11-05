package ru.yuhimenko.MySecondTestAppSpringBoot.model;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
public enum Systems {

    ERP("Enterprise Resource Planning"),
    CRM("Customer Relationship Management"),
    WMS("Warehouse Management System"),
    Service1("Service 1");

    private final String name;

    Systems(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @JsonCreator
    public static Systems getSystemsFromName(String name) {
        for (Systems systems : Systems.values()) {
            if (systems.getName().equalsIgnoreCase(name)) {
                return systems;
            }
        }
        return null;
    }
}