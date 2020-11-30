package com.json.parse.menu;

public class MenuItem {
    private String name;
    private String description;
    private String price;       // TODO: use proper type
    private String calories;    // TODO: use proper type

    public MenuItem(String name, String description, String price, String calories) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "" + name + ", " + description + ", " + price + ", " + calories;
    }
}
