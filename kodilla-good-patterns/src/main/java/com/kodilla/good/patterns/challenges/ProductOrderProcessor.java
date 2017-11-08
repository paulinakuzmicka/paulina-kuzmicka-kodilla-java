package com.kodilla.good.patterns.challenges;


public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(InformationService informationService, ProductOrderService productOrderService, ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDTO process(ProductOrderRequest productOrderRequest){
        boolean isSuccesfullySold = productOrderService.sold(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(), productOrderRequest.getQuantity());
        if (isSuccesfullySold) {
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.createProductOrder(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(), productOrderRequest.getQuantity());
            return new ProductOrderDTO(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(), productOrderRequest.getQuantity(), isSuccesfullySold);
        } else {
            return new ProductOrderDTO(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(), productOrderRequest.getQuantity(), isSuccesfullySold);
        }
    }
}
