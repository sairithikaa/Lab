package accessmodifier.p1;

public class C2P1 {
    public static void main(String[] args) {
        C1P1 c1p1 = new C1P1();
        System.out.println(c1p1.defaultVar);
        System.out.println(c1p1.publicVar);
        System.out.println(c1p1.protectVar);
    }
}
