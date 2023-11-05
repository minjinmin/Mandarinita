package acta;
/**
 *
 * @author minjinmin
 */
public class main {

    public static void main(String[] args) {
        Acta acta = new Acta(3,4);
        acta.poblar();
       
        for (int i = 0; i < acta.getNotas().length; i++) {
            for (int j = 0; j < acta.getNotas()[0].length; j++) {
                System.out.println(acta.getNotas()[i][j] + "-");
            }
            System.out.println("Promedio= "+acta.promedioAlumno(i));
            System.out.println("");
        }
        System.out.println("Promedio Total= "+acta.promedioTotal());
    }
}
