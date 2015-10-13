package es.danirod.rectball.listeners;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import es.danirod.rectball.RectballGame;
import es.danirod.rectball.utils.SoundPlayer;

/**
 * @since 0.3.0
 */
public class ScreenPopper extends ChangeListener {

    private RectballGame game;

    public ScreenPopper(RectballGame game) {
        this.game = game;
    }

    @Override
    public void changed(ChangeEvent event, Actor actor) {
        game.player.playSound(SoundPlayer.SoundCode.FAIL);
        game.popScreen();

        // Cancel the event to avoid checking the actor
        event.cancel();
    }


}
