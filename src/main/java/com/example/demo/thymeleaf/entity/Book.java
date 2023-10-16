package com.example.demo.thymeleaf.entity;

public class Book {
    private Long id;
    private String name;
    private String description;
    private Integer totalPage;
    private Float price;

    public Book() {
    }

    public Book(Long id, String name, String description, Integer totalPage, Float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.totalPage = totalPage;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", totalPage=" + totalPage +
                ", price=" + price +
                '}';
    }
}
