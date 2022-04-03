import com.CMPT276_Group1.project.*;
import com.CMPT276_Group1.project.tile.Tile;
import com.CMPT276_Group1.project.tile.TileManager;
import org.junit.jupiter.api.*;

import java.awt.event.*;

import static org.junit.jupiter.api.Assertions.*;
public class TileManagerTest {
    private TileManager TM;
    private GamePanel GP;

    @BeforeEach
    void setUp() {
        GP = new GamePanel();
        TM = new TileManager(GP);
    }

    @Test
    public void constructorTest(){
       TileManager TestTM = new TileManager(GP);
       assertNotNull(TestTM, "Check that the object is constructed");
    }

    @Test
    public void getTileImageTest(){
        TM.getTileImage();
        assertNotNull(TM.tile[0]);
        assertNotNull(TM.tile[1]);
        assertNotNull(TM.tile[2]);
    }

    @Test
    public void loadMapTest(){
        TM.loadMap("/maps/map_1.txt");
        assertNotNull(TM.mapTileNum);
    }


}