package ContaBancariaV2;

import Pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        int numero = 12345;
        Pessoa titular = null;
        titular.setNome("Gabriel");
        titular.setIdade(22);
        titular.setCpf("123.456.987-20");

        ContaBancariaV2 conta1 = new ContaBancariaV2(numero,titular);
        System.out.println(conta1.toString());
    }
}
