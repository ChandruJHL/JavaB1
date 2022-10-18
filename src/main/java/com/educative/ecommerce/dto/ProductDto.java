package com.educative.ecommerce.dto;
import com.educative.ecommerce.model.Product;
import javax.validation.constraints.NotNull;

public class ProductDto {

    private @NotNull String name;
    private @NotNull String imageURL;
    private @NotNull double price;
    private @NotNull String description;
   // private @NotNull Integer categoryId;

    private  @NotNull int id;

    public ProductDto(@NotNull String name, @NotNull String imageURL, @NotNull double price, @NotNull String description, @NotNull Integer categoryId) {
        this.name = name;
        this.imageURL = imageURL;
        this.price = price;
        this.description = description;

    }

    public ProductDto(Product product) {
        this.setName(product.getName());
        this.setImageURL(product.getImageURL());
        this.setDescription(product.getDescription());
        this.setPrice(product.getPrice());

    }

    public ProductDto() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}