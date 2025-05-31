package com.FashNova.response;

import com.FashNova.dto.OrderHistory;
import com.FashNova.model.Cart;
import com.FashNova.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
