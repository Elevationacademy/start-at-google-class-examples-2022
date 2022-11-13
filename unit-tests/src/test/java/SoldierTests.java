import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SoldierTests {
    private Soldier soldier;

    @BeforeEach
    void beforeEach() {
        soldier = new Soldier();
    }

    @Test
    void solider_DefaultRank_EqualsPRIVATE() {
        assertEquals(Soldier.Rank.PRIVATE, soldier.getRank(), "Soldier ranks are not equal");

    }

    @Test
    void promote_Rank_EqualsCORPORAL() {
        soldier.promote();
        assertEquals(Soldier.Rank.CORPORAL, soldier.getRank());
    }


}
