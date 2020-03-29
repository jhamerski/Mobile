package com.example.sobrecargaconstrutoresinterface.classes;

public class Jonas extends Cidadao implements Presidente {

    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleição no Brasil.");
    }
}
