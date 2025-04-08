package study.factory;

import java.math.BigInteger;
import java.time.Instant;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando testes da classe Product");
        String name = "COMPUTADOR";
        double price = 9.22;
        String gift = "cupom";

      Product computador = Product.createProduct(name,price);
      Product cupom =  Product.giftProduct(gift);

        System.out.println(computador);
        System.out.println(cupom);

        Date d = Date.from(Instant.now());
        System.out.println(d);
        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
        System.out.println(prime);
    }
}