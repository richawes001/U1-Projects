import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */

public class RPGCharacter {

    public static void main(String[] args) {

        DecimalFormat roundTo2 = new DecimalFormat(("0.00"));

        String name;
        int level;
        double strength, bulk, durability, attack, defense, intelligence, mana, hp, mp;

        strength = Double.parseDouble(JOptionPane.showInputDialog("What is your strength level?"));
        durability = Double.parseDouble(JOptionPane.showInputDialog("What is your durability level?"));
        bulk = Double.parseDouble(JOptionPane.showInputDialog("What is your bulk level?"));
        intelligence = Double.parseDouble(JOptionPane.showInputDialog("What is your intelligence level?"));
        mana = Double.parseDouble(JOptionPane.showInputDialog("What is your mana level?"));
        level = Integer.parseInt(JOptionPane.showInputDialog("What is your character's level as an integer?"));
        name = JOptionPane.showInputDialog("What is your character's name?");

        attack = ((((strength + bulk) * 2) + (Math.sqrt(strength*bulk)) * level)/100) + level + 5;
        defense = ((((durability + bulk) * 2) + (Math.sqrt(durability*bulk)) * level)/100) + level + 5;
        hp = ((((defense + defense) * 2) + (Math.sqrt(defense*defense)) * level)/100) + level + 10;
        mp = ((((intelligence + mana) * 2) + (Math.sqrt(intelligence*mana)) * level)/100) + level + 10;

        String atkDisplay = roundTo2.format(attack);
        String defDisplay = roundTo2.format(defense);
        String hpDisplay = roundTo2.format(hp);
        String mpDisplay = roundTo2.format(mp);

        JOptionPane.showMessageDialog(null, name + "'s attack stat, based on strength and bulk is: " + atkDisplay + ".");
        JOptionPane.showMessageDialog(null, name + "'s defense stat, based on durability and bulk is: " + defDisplay + ".");
        JOptionPane.showMessageDialog(null, name + "'s health point stat, based on defense is: " + hpDisplay + ".");
        JOptionPane.showMessageDialog(null, name + "'s magic power stat, based on mana and attack is: " + mpDisplay + ".");

        System.exit(0);
    }
}
