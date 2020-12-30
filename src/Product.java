public class Product {
    public Integer discountThreshold;
    public Double discountRate;
    Double basePrice;

    public Product(Integer discountThreshold, Double discountRate, Double basePrice) {
        this.discountThreshold = discountThreshold;
        this.discountRate = discountRate;
        this.basePrice = basePrice;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public Integer getDiscountThreshold() {
        return discountThreshold;
    }

    public void setDiscountThreshold(Integer discountThreshold) {
        this.discountThreshold = discountThreshold;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }
}
