import java.math.BigInteger;
import java.nio.ByteBuffer;

/**
 * Created by miguelgomezcuesta on 29/07/15.
 */
public class UtilByte {
    public static void main(String[] args) {
//        Byte b = new Byte((byte) -128);
//        Byte bString = new Byte("-128");
//
//        System.out.println("b: "+b.toString());
//        System.out.println("bString: "+bString.toString());
//        System.out.println("binario: "+ Integer.toString(128,2));
//        System.out.println("binario: "+ Integer.toBinaryString(128));

//       //short a = Short.parseShort(bitmap, 2);
//        int entero =Integer.parseInt(bitmap,2);
//        ByteBuffer bytes = ByteBuffer.allocate(2).putInt(entero);
//        byte[] array = bytes.array();
//        for(byte vbyte:array) System.out.println("array: "+vbyte);
//

        String bitmap = "1000000"+"00100001";
        BigInteger bigInteger = new BigInteger(bitmap, 2);
        System.out.println("biginter: "+bigInteger);
        //byte[] barray = bigInteger.toByteArray();
        byte[] barray = {-128,1};
        for(byte vbyte:barray) System.out.println("barray: "+vbyte);

        System.out.println("binarioString: "+String.format("%8s", Integer.toBinaryString(barray[0] & 0xFF)).replace(' ', '0'));
        System.out.println("binarioString: "+String.format("%8s", Integer.toBinaryString(barray[1] & 0xFF)).replace(' ', '0'));

        int total = Integer.parseInt(bitmap, 2);
        System.out.println("entero: "+ total);
        System.out.println("Numero de sorteos: "+ logaritmoRedondeo(total));


    }

    private static int logaritmoRedondeo(int total) {
        return new Double(Math.ceil(Math.log(total) / Math.log(2))).intValue();
    }
}
