package com.marketplace.api.repository;

import com.marketplace.api.model.Pedido;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PedidoRepository {

    private final JdbcTemplate jdbc;

    private final RowMapper<Pedido> pedidoRowMapper = (rs, rowNum) -> {
        Pedido p = new Pedido();
        p.setId(rs.getLong("id"));
        p.setStatus(rs.getString("status"));
        p.setCriadoEm(rs.getTimestamp("criado_em").toLocalDateTime());
        return p;
    };



}
