package com.tower.modeljava;

import javax.persistence.*;

@Entity
@Table(name = "factura")
public class Factura {

    public Factura() {}

    public Factura(Double total, Producto producto) {
        this.total = total;
        this.producto = producto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double total;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Producto producto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", total=" + total +
                ", producto=" + producto +
                '}';
    }
}
