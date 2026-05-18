package com.marketplace.api.dto;

import com.marketplace.api.model.ItemPedido;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class PedidoDTO {

    @NotEmpty(message = "O pedido deve ter pelo menos um item")
    private List<ItemPedido> itens;
}
