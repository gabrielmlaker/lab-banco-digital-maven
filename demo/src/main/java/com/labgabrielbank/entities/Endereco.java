package com.labgabrielbank.entities;

import lombok.Data;

@Data
public class Endereco {

    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String UF;
    private String pais;

    public Endereco(String cep, String logradouro, String numero, String complemento, String cidade, String uF,
            String pais) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.UF = uF;
        this.pais = pais;
    }

    public Endereco() {
    }

    public String imprimirEndereco() {
        return String.format("CEP: %s, Logradouro: %s, Número: %s, Complemento: %s, Cidade: %s, UF: %s, País: %s. ",
                this.cep, this.logradouro, this.numero, this.cidade, this.UF, this.pais);
    }

}
