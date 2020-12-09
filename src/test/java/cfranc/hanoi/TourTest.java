package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

    Disque PETIT = new Disque(1);
    Disque MOYEN = new Disque(2);
    Disque GRAND = new Disque(3);

    Tour TOUR_VIDE = new Tour();

    @Test
    public void empiler_tourVide_vraie() {
        
        boolean expected = true;
        boolean actual = TOUR_VIDE.empiler(PETIT);
        assertEquals(expected, actual);
    }
 
    @Test
    public void empiler_tourPleine_faux() {
        Tour tour_pleine = new Tour(1);
        tour_pleine.disques.add(PETIT);
        
        boolean expected = false;
        boolean actual = tour_pleine.empiler(PETIT);
        assertEquals(expected, actual);
    }


    @Test
    public void empiler_disqueTropGrand_faux() {
        Tour tour_libre = new Tour(2);
        tour_libre.disques.add(PETIT);

        boolean expected = false;
        boolean actual = tour_libre.empiler(GRAND);
        assertEquals(expected, actual);
    }

    @Test
    public void empiler_disquePlusPetit_vraie() {
        Tour tour_libre = new Tour(2);
        tour_libre.disques.add(GRAND);

        boolean expected = true;
        boolean actual = tour_libre.empiler(PETIT);
        assertEquals(expected, actual);
    }

}
