public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        System.out.println("Pertambahan : " + mtk.pertambahan(20, 10));
        System.out.println("Pengurangan : " + mtk.pengurangan(30, 15));
        System.out.println("Perkalian   : " + mtk.perkalian(15, 2));
        System.out.println("Pembagian   : " + mtk.pembagian(30, 3));

        Matematika2 mtk2 = new Matematika2();
        System.out.println("Modulus     : " + mtk2.modulus(22, 8));
    }
}
