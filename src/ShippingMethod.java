public class ShippingMethod {
    public Double discountThreshold;
    Double discountedFee;
    Double feePerCase;

    public Double getDiscountedFee() {
        return discountedFee;
    }

    public void setDiscountedFee(Double discountedFee) {
        this.discountedFee = discountedFee;
    }

    public Double getFeePerCase() {
        return feePerCase;
    }

    public void setFeePerCase(Double feePerCase) {
        this.feePerCase = feePerCase;
    }
}
