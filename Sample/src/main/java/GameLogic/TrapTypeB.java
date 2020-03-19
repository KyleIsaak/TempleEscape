package GameLogic;

/**
 * Represents a specific kind of Traps (Lava Pits) in the game.
 * Player lose points when stepped on traps.
 */
public class TrapTypeB extends Trap {
    private int damage = 20;
    private  char type = 'B';

    /**
     * Default Constructor
     */
    public TrapTypeB() { super(new int[] {0,0}); }

    /**
     * Get the damage of this trap.
     * @return the damage of this trap.
     */
    public int getDamage() { return damage; }

    /**
     * Get the type of this Trap which is A (Lava Pit)
     * @return the type of this Trap which is A (Lava Pit)
     */
    public char getType() { return type; }

}
