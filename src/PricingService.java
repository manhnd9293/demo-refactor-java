public class PricingService {
    public Double priceOrder(Product product, Integer quantity, ShippingMethod shippingMethod) {
        Double basePrice = product.basePrice * quantity;
        Double discount = Math.max(quantity - product.discountThreshold, 0) * product.basePrice * product.discountRate;
        Double shippingPerCase = (basePrice > shippingMethod.discountThreshold)
                ? shippingMethod.discountedFee : shippingMethod.feePerCase;
        double shippingCost = quantity * shippingPerCase;
        double price = basePrice - discount + shippingCost;
        return price;
    }
}
