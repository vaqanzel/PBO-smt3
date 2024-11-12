package Tugas;

class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (health * 0.2);
                break;
            case 2:
                health += (health * 0.3);
                break;
            case 3:
                health += (health * 0.4);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (health * 0.02);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\nHealth: " + (int)health + " \nLevel: " + level;
    }
}
