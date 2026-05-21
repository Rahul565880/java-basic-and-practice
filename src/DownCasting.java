
// Superclass
class Coach {
    public void train() {
        System.out.println("General training session starts");
    }

    public void giveAdvice() {
        System.out.println("General sports advice given");
    }
}

// Subclass for Football
class FootballCoach extends Coach {
    @Override
    public void train() {
        System.out.println("Football training session starts");
    }

    public void setFormation() {
        System.out.println("Setting up the football team formation");
    }
}

// Subclass for Tennis
class TennisCoach extends Coach {
    @Override
    public void train() {
        System.out.println("Tennis training session starts");
    }

    public void coachServeTechnique() {
        System.out.println("Coaching tennis serve technique");
    }
}

// Main class to execute and demonstrate downcasting
public class DownCasting{
    public static void main(String[] args) {
        // 1. Instantiate objects using Coach (Superclass) references
        Coach coachFootball = new FootballCoach();
        Coach coachTennis = new TennisCoach();

        // 2. Demonstrate overridden methods (Polymorphism)
        coachFootball.train();
        coachTennis.train();

        System.out.println("--------------------------------------");

        // 3. Downcasting to access subclass-specific methods

        // Check instance type and downcast for FootballCoach
        if (coachFootball instanceof FootballCoach) {
            ((FootballCoach)coachFootball).setFormation();
        }

        // Check instance type and downcast for TennisCoach
        if (coachTennis instanceof TennisCoach) {
            ((TennisCoach) coachTennis).coachServeTechnique();
        }
    }
}