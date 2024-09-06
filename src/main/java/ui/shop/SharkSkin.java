package ui.shop;

import Main.Game;
import Utilz.LoadSave;

import java.awt.image.BufferedImage;

import static Utilz.Constants.SkinsDetails.*;

public class SharkSkin extends SkinToBuy {

    public SharkSkin(Game game, int xPos, int yPos) {
        super(game, "Shark", xPos, yPos, SKIN_WIDTH, SKIN_HEIGHT, 0);

        price = 50;
    }

    protected void initCollSpaces() {
        collLeftSpace = (int) (7*Game.SCALE);
        collRightSpace = (int) (5*Game.SCALE);
        collTopSpace = (int) (5*Game.SCALE);
        collBottomSpace = (int) (3*Game.SCALE);
    }

    protected void loadImgs() {
        imgs = new BufferedImage[SPRITES_IN_ROW][SPRITES_IN_COL];

        for (int i = 0; i < imgs.length; i++) {
            for (int j = 0; j < imgs[0].length; j++) {
                imgs[i][j] = LoadSave.GetSpriteAtlas(LoadSave.SHARK_SKIN_ATLAS).getSubimage(j*SKIN_DEFAULT_WIDTH, i*SKIN_DEFAULT_HEIGHT, SKIN_DEFAULT_WIDTH, SKIN_DEFAULT_HEIGHT);
            }
        }
    }
}