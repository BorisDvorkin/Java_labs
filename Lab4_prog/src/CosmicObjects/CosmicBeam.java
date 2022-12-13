package CosmicObjects;

import java.lang.String;
import Interfaces.Affect;

public class CosmicBeam extends CosmicObject implements Affect {
    public CosmicBeam(String name){
        super(name, CosmicObjectType.COSMICBEAM);
    }

    @Override
    public String reflect(int otherLight){
        return this.getName() + " отражает свет с силой " + otherLight;
    }

    @Override
    public String light(int light){
        return this.getName() + " светит с силой " + light;
    }

    //TODO
    // Check that affect logic, it could be incorrect

    public String affect(int affect, CosmicObject surface){
        class GiveSpecialAbility {
            private int affect;
            private CosmicObject surface;

            public GiveSpecialAbility(int affect, CosmicObject surface) {
                this.affect = affect;
                this.surface = surface;
            }

            public String findOutSpecialAbility() {
                if (surface.getName() == "Moon" && affect > 0) {
                    return surface.getName() + " Обладает способностью светиться с силой " + affect;
                }
                return "Космические лучи действуют на всех людей на " + surface.getName() + " с силой " + affect;
            }
        }
        GiveSpecialAbility ability = new GiveSpecialAbility(affect, surface);
        return ability.findOutSpecialAbility();
    }
}
