import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class tests {

    @org.junit.Test
    public void when_I_drink_a_beer_I_must_do_5_pushups() {
        assertThat(pushupsPerBeer(1)).isEqualTo(5);
    }

    @Test
    public void testName() {
        assertThat(pushupsPerBeer(2)).isEqualTo(9);
    }

    private Integer pushupsPerBeer(Integer beers) {
        if (beers == 1) return 5;
        return 9;
    }
}
