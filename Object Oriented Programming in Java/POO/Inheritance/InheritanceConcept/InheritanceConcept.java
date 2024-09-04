public class InheritanceConcept {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);

        AdvCalc obj2 = new AdvCalc();
        int r3 = obj2.add(4, 5);
        int r4 = obj2.sub(7, 3);
        int r5 = obj2.multi(4, 5);
        int r6 = obj2.div(8, 2);

        VeryAdvCalc obj3 = new VeryAdvCalc();
        int r7 = obj3.add(4, 5);
        int r8 = obj3.sub(7, 3);
        int r9 = obj3.multi(4, 5);
        int r10 = obj3.div(8, 2);
        double r11 = obj3.power(2, 3);

        System.out.println(r1 + " " + r2); 
        System.out.println(r3 + " " + r4 + " " + r5 + " " + r6);
        System.out.println(r7 + " " + r8 + " " + r9 + " " + r10 + " " + r11);
    }
}
