package com.tenx.ms.retail.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class StockEntity {
    private Long productId;
    private Long storeId;
    private Integer count;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
