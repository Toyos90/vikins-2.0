package org.example.war;
import java.util.ArrayList;
import java.util.List;
import org.example.vikins.Viking;
import org.example.saxon.Saxon;
public class War {
    public List<Viking> vikingArmy = new ArrayList<>();
    public List<Saxon> saxonArmy = new ArrayList<>();

    public void addViking(Viking viking) {
        this.vikingArmy.add(viking);
    }

    public List<Viking> getVikingArmy() {
        return vikingArmy;
    }

    public void addSaxon(Saxon saxon) {
        this.saxonArmy.add(saxon);
    }

    public List<Saxon> getSaxonArmy() {
        return saxonArmy;
    }

    public String vikingAttack() {
        int randomSaxonIndex = (int) Math.floor(Math.random() * this.saxonArmy.size());
        Saxon randomSaxon = this.saxonArmy.get(randomSaxonIndex);
        int randomVikingIndex = (int) Math.floor(Math.random() * this.vikingArmy.size());
        Viking randomViking = this.vikingArmy.get(randomVikingIndex);

        String result = randomSaxon.receiveDamage(randomViking.attack());

        if (randomSaxon.getHealth() <= 0) {
            this.saxonArmy.remove(randomSaxonIndex);
        }

        return result;
    }

    public String saxonAttack() {
        int randomSaxonIndex = (int) Math.floor(Math.random() * this.saxonArmy.size());
        Saxon randomSaxon = this.saxonArmy.get(randomSaxonIndex);
        int randomVikingIndex = (int) Math.floor(Math.random() * this.vikingArmy.size());
        Viking randomViking = this.vikingArmy.get(randomVikingIndex);

        String result = randomViking.receiveDamage(randomSaxon.attack());

        if (randomViking.getHealth() <= 0) {
            this.vikingArmy.remove(randomVikingIndex);
        }

        return result;
    }

    public String showStatus() {
        if (this.saxonArmy.size() == 0) {
            return "¡Los vikingos han ganado la guerra del siglo!";
        } else if (this.vikingArmy.size() == 0) {
            return "¡Los sajones han luchado por sus vidas y sobrevivido otro día!";
        } else {
            return "¡La guerra continúa!";
        }
    }
}
