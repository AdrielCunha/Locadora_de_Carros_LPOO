/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Carro {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public float getProcodiaria() {
        return procodiaria;
    }

    public void setProcodiaria(float procodiaria) {
        this.procodiaria = procodiaria;
    }

    public float getValoripva() {
        return valoripva;
    }

    public void setValoripva(float valoripva) {
        this.valoripva = valoripva;
    }

    public float getValorseguro() {
        return valorseguro;
    }

    public void setValorseguro(float valorseguro) {
        this.valorseguro = valorseguro;
    }
    
    private int id;
    private String marca, modelo, chassi, placa, cor, seguro;
    private float procodiaria, valoripva, valorseguro;
}
