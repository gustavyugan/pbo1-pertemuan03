package Percabangan;

public class SwitchChar {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai) {
            case 'A':
                System.out.println("Pelanggan   : \"Martabak 1 bang\"");
                System.out.println("Kang Bakso  : \"Oke \"");
            case 'B':
                System.out.println("Pelanggan   : \"Bakso Gausah Pake kuah \"");
                System.out.println("Kang Bakso  : \"Eh apaansi ??\"");
            case 'C':
                System.out.println("Pelanggan   : \"Wedang jahe 1 gan\"");
                System.out.println("Kang Bakso  : \"Wedangnya gapake jahe ya?\"");
                System.out.println("Pelanggan   : \"Yaudah gajadi beli\"");
            default:
                System.out.println("Pelanggan   : \"Tahu 1nya berapa\"");
                System.out.println("Kang Bakso  : \"1000 pak \"");
                System.out.println("Pelanggan   : \"Oke gajadi kemahalan soalnya\"");
                System.out.println("Kang Bakso  : \"Ha?\"");
        }
    }
}
