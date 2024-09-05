package warteschlange;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PrioritaetsWarteschlange {
    public static void main(String[] args) {
        // Erstellen einer PriorityQueue mit einem benutzerdefinierten Comparator
        PriorityQueue<Aufgabe> warteschlange = new PriorityQueue<>(
            Comparator.comparingInt(Aufgabe::getPrioritaet).reversed()
        );

        
        warteschlange.offer(new Aufgabe("E-Mails beantworten", 2));
        warteschlange.offer(new Aufgabe("Bericht schreiben", 1));
        warteschlange.offer(new Aufgabe("Dringende Kundenanfrage", 3));
        warteschlange.offer(new Aufgabe("Mittagspause", 4));

        // Elemente aus der Warteschlange entnehmen und ausgeben
        while (!warteschlange.isEmpty()) {
            System.out.println(warteschlange.poll());
        }
    }
}

class Aufgabe {
    private String beschreibung;
    private int prioritaet;

    public Aufgabe(String beschreibung, int prioritaet) {
        this.beschreibung = beschreibung;
        this.prioritaet = prioritaet;
    }

    public int getPrioritaet() {
        return prioritaet;
    }

    @Override
    public String toString() {
        return "Aufgabe: " + beschreibung + " (Priorität: " + prioritaet + ")";
    }
}