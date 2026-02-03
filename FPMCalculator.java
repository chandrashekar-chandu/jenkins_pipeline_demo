public class FPMCalculator {
    public static void main(String[] args) {

        // Sample input values (fixed for Jenkins)
        int ei = 5;
        int eo = 4;
        int eq = 3;
        int ilf = 2;
        int eif = 1;
        int gsc = 35;

        int EI = 4, EO = 5, EQ = 4, ILF = 10, EIF = 7;

        int UFP = (ei * EI) + (eo * EO) + (eq * EQ) + (ilf * ILF) + (eif * EIF);
        double AFP = UFP * (0.65 + 0.01 * gsc);

        System.out.println("===== FUNCTION POINT METRICS =====");
        System.out.println("EI  = " + ei);
        System.out.println("EO  = " + eo);
        System.out.println("EQ  = " + eq);
        System.out.println("ILF = " + ilf);
        System.out.println("EIF = " + eif);
        System.out.println("GSC = " + gsc);
        System.out.println("----------------------------------");
        System.out.println("UFP = " + UFP);
        System.out.println("AFP = " + AFP);
    }
}
