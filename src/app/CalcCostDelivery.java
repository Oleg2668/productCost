package app;

public class CalcCostDelivery {
    // Вартість доставки
    private final static double deliveryPrice ;

    // Розрахунок вартості товару,
    // з урахуванням вартості доставки
    @Override
    public double calcCost(Product product) {
        return product. product.getPrice()
                + deliveryPrice;
    }
}
