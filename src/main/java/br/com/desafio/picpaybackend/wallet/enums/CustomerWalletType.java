package br.com.desafio.picpaybackend.wallet.enums;

public enum CustomerWalletType {

    COMMON(1),
    MERCHANT(2);

    private int value;

    private CustomerWalletType(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
