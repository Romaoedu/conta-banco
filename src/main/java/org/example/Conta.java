package org.example;


public class Conta {

    int numero;
    String agencia;
    String nomeDoCliente;
    double saldo;

    public Conta(){}

    public Conta(int numero, String agencia, String nomeDoCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeDoCliente = nomeDoCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
