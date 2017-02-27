package com.tenx.ms.retail.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product_order")
public class ProductOrderEntity {
    private Long orderId;
    private Long storeId;
    private Long productId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
