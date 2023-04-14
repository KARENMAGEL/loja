/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/AnnotationType.java to edit this template
 */
package loja;

/**
 *
 * @author Alunos
 */
class pedidoitem {
    private int quantidade;
    private double subtotal; 
    private final String produto;

    

    public pedidoitem(int quantidade, double subtotal, String produto) {
        this.quantidade = quantidade;
        this.subtotal = subtotal;
        this.produto = produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }

  
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

 
}

