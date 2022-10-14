import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.isExactlyInstanceOf;

public class GlueTest {

    @Test
    public void showSuperGlue(){
        assertThat(new Strategy(new SuperGlue(new StandardDisplay()))).isInstanceOf(Glue.class);
    }

    @Test
    public void showWoodGlue(){
        assertThat(new Strategy(new WoodGlue(new StandardDisplay()))).isInstanceOf(Glue.class);
    }


    @Test
    public void showPrittStick(){
        assertThat(new Strategy(new PrittStick(new StandardDisplay()))).isInstanceOf(Glue.class);
    }

}
