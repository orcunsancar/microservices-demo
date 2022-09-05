package jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;

public class TestJasypt {

    public static void main(String[] args) {

        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        standardPBEStringEncryptor.setPassword("Demo_Pwd!2020");
        standardPBEStringEncryptor.setAlgorithm("PBEWithHMACSHA512AndAES_256");
        standardPBEStringEncryptor.setIvGenerator(new RandomIvGenerator());
        String result = standardPBEStringEncryptor.encrypt("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");
        System.out.println(result);
        System.out.println(standardPBEStringEncryptor.decrypt(result));

    }
}
